angular.module('app.controllers', [])

.controller('pageCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {
  //initialize the model handler in the controler
  $scope.mdl={};

  $scope.resetButton = function() {
    $scope.mdl.input1 = "";
    $scope.mdl.radio1 = "1";
    $scope.mdl.checkbox1 = false;
    $scope.mdl.checkbox2 = false;
    $scope.mdl.range1 = 5;
    $scope.mdl.toggle1 = false;

  }
}])

.controller('page2Ctrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])
