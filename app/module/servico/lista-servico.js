'use strict';

/**
 * @ngdoc overview
 * @name comunidadeLigadaWebappApp
 * @description
 * # comunidadeLigadaWebappApp
 *
 * Main module of the application.
 */
angular.module('comunidadeLigadaWebappApp.servico')
  .controller('ListaServicoCtrl', function($scope, $http) {
    
    $scope.state = 'listagem';

    var recurso = '/api/servico';


    $scope.novo = function() {
      $scope.state = 'cadastro';
      $scope.item = {};
    }

    $scope.salvar = function() {
      if($scope.servicoForm.$invalid) {
        return;
      }

      var promise;
      if($scope.state == 'edicao') {
        promise = $http.put($scope.item._links.self.href, $scope.item)
      } else {
        promise = $http.post(recurso, $scope.item);
      }

      promise.then($scope.listar, function() {
          $scope.mensagem = {
            type: 'Danger',
            mensagem: 'Erro ao realizar operação'
          }
        })
        .then(function() {
          $scope.item = {};
          $scope.state = 'listagem';
        });
    }

    $scope.listar = function() {
      $http.get(recurso)
        .then(function(response) {
          $scope.itens = response.data._embedded.servico;
        });
    }

    $scope.editar = function(item) {
      $scope.state = 'edicao';
      $scope.item = item;
    }

    $scope.remover = function (item) {
      $http.delete(item._links.self.href).then($scope.listar);
    }

    $scope.cancelar = function() {
      $scope.state = 'listagem';
      $scope.item = undefined;
    }

    $scope.listar();
  });