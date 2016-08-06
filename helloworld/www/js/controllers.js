angular.module('starter.controllers', [])

.controller('DashCtrl', function($scope) {

  $scope.tareas = [
    { title: 'Comprar la leche', desc: 'Comprar 2 litros' },
    { title: 'Ir por las tortillas', desc: 'Que no se enfrien' },
    { title: 'Comprar videojuegos', desc: 'Mad Max estaria bien' },
    { title: 'Sacar al perro', desc: 'Ya esta gordo y tu tambien, ejercitate' },
    { title: 'Limpiar el cuarto', desc: 'Ya encontraste tu gameboy?' },
    { title: 'Volver a comprar la leche', desc: 'Si toman leche en esta casa' }
  ]

})

.controller('ChatsCtrl', function($scope, $http, $rootScope) {

  $scope.getData = function(){
    $scope.estaciones = []
    $http.get('http://api.citybik.es/v2/networks/ecobici')
          .success(function(response){
            $scope.estaciones = response.network.stations
            $rootScope.firsStation = $scope.estaciones[0]
            console.log("JSON: ", response);
          })
          .error(function(error){
            console.log("Error" + error)
          });
  }

})

.controller('ChatDetailCtrl', function($scope, $stateParams, $rootScope) {
  //$scope.name = $stateParams.nameStation
  $scope.name = $rootScope.firsStation.name
})

.controller('AccountCtrl', function($scope) {
  $scope.settings = {
    enableFriends: true
  };
});
