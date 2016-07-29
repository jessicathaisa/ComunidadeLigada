'use strict';

/**
 * @ngdoc overview
 * @name comunidadeLigadaWebappApp
 * @description
 * # comunidadeLigadaWebappApp
 *
 * Main module of the application.
 */
 angular.module('comunidadeLigadaWebappApp.login', [])
	.config(function($routeProvider) {
		$routeProvider
	 	.when('/login', {
	 		templateUrl: 'module/login/login.html',
	 		controller: 'LoginCtrl'
	 	});
	})
	.run(function($http, $location) {
		$http.get('/api/user')
		 	.then(angular.noop, function() {
		 		$location.path('/login')
		 	});
	});