app.controller("loginModalCtrl", function($scope, $uibModalInstance) {
  
     console.log(" >>>>>>>>>>>>>> click loginModalCtrl    ");

    $scope.ok = function(){
        $uibModalInstance.close("Ok");
    }
   
    $scope.cancel = function(){
        $uibModalInstance.dismiss();
    } 
});