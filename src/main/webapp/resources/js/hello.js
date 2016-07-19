function Hello($scope, $http) {
    $http.get('http://localhost:8080/agoravai').
        success(function(data) {
            $scope.greeting = data;
			alert(data);
        });
}