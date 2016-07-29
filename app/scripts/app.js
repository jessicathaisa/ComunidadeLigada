'use strict';

/**
 * @ngdoc overview
 * @name comunidadeLigadaWebappApp
 * @description
 * # comunidadeLigadaWebappApp
 *
 * Main module of the application.
 */
angular
  .module('comunidadeLigadaWebappApp', [
    'ngAnimate',
    'ngAria',
    'ngCookies',
    'ngMessages',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch',

    'comunidadeLigadaWebappApp.login',
    'comunidadeLigadaWebappApp.servico'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl',
        controllerAs: 'main'
      })
      .when('/about', {
        templateUrl: 'views/about.html',
        controller: 'AboutCtrl',
        controllerAs: 'about'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
