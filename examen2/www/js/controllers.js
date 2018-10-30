angular.module('app.controllers', [])

.controller('pageCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])

.controller('page2Ctrl', ['$scope', '$stateParams', '$http',// The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams, $http) {

  APIkey="Y8WM6DIZW9EQPFS8";
    company = $stateParams.company;

    url = "https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol="+ company + "&apikey=" + APIkey;

    $http.get(url).then(function(response){
        $scope.company = response.data["Global Quote"]["01. symbol"];
        $scope.price = response.data["Global Quote"]["05. price"];
        $scope.prevprice = response.data["Global Quote"]["08. previous close"];
        $scope.date = response.data["Global Quote"]["07. latest trading day"];

          $scope.result = $scope.price - $scope.prevprice;
          if ($scope.result >0){
            $scope.invest = "KEEP";
          } else {
              $scope.color = "red";
              $scope.invest = "SELL";
          }      }, function(error){
        //alert('UNABLE TO RETRIEVE DATA');
      });


}])
