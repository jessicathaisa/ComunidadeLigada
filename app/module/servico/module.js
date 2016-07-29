'use strict';

/**
 * @ngdoc overview
 * @name comunidadeLigadaWebappApp
 * @description
 * # comunidadeLigadaWebappApp
 *
 * Main module of the application.
 */
angular.module('comunidadeLigadaWebappApp.servico', [])
  .config(function($routeProvider) {
	$routeProvider
      .when('/servico', {
        templateUrl: 'module/servico/lista-servico.html',
        controller: 'ListaServicoCtrl'
      })
  });;