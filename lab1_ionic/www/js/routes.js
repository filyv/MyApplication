angular.module('app.routes', [])

.config(function($stateProvider, $urlRouterProvider) {

  // Ionic uses AngularUI Router which uses the concept of states
  // Learn more here: https://github.com/angular-ui/ui-router
  // Set up the various states which the app can be in.
  // Each state's controller can be found in controllers.js
  $stateProvider
    

      .state('frenchFriesSimulator', {
    url: '/page1',
    templateUrl: 'templates/frenchFriesSimulator.html',
    controller: 'frenchFriesSimulatorCtrl'
  })

  .state('frenchFriesSimulator2', {
    url: '/page2',
    templateUrl: 'templates/frenchFriesSimulator2.html',
    controller: 'frenchFriesSimulator2Ctrl'
  })

$urlRouterProvider.otherwise('/page1')


});