app.controller("mainCtrl", function($scope, $uibModal) {
  
   $scope.open = function() {
       console.log(">>>>>>>>>>>>>>>>Asdasdas  ");
    var modalInstance =  $uibModal.open({
      templateUrl: "assets/html/loginModal.html",
      controller: "loginModalCtrl",
        windowClass: 'clsPopup'
    });
    console.log(">>>>>>>>>>>>>>>>modalInstance  " , modalInstance);
    modalInstance.result.catch(function error(error) {
      if(error === "backdrop click") {
        // do nothing
      } else {
        throw error;
      }
    }).then(function(response){
       console.log("Done");
    });
    
  };

});