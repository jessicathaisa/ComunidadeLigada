'use strict';

/**
 * @ngdoc overview
 * @name comunidadeLigadaWebappApp
 * @description
 * # comunidadeLigadaWebappApp
 *
 * Main module of the application.
 */
 angular.module('comunidadeLigadaWebappApp.oferta', [])
	.config(function($routeProvider) {
		$routeProvider
	 	.when('/oferta', {
	 		templateUrl: 'module/oferta/oferta.html',
	 		controller: 'OfertaCtrl'
	 	});
	})