'use strict';

/**
 * @ngdoc overview
 * @name comunidadeLigadaWebappApp
 * @description
 * # comunidadeLigadaWebappApp
 *
 * Main module of the application.
 */
angular.module('comunidadeLigadaWebappApp.login')
  .controller('LoginCtrl', function($scope, $http, $log, $location) {
    $scope.logar = function() {
      $http.post('/api/login?usuario=' + $scope.login + '&senha=' + $scope.senha)
        .then(function(response) {
          $log.info('Login realizado com sucesso', response.data);
          $location.path('/');            
        }, function() {
          $log.info('Falha ao realizar o Login');
          $scope.loginFalhou = true;
        });
    }
  });
