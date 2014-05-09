function userManagement($scope, $http){
	
	 $scope.getUserList = function(){		 
		 $http.get('http://localhost:8080/SpringJDBCTemplate/getList').
	     success(function(data) {	    	
	         $scope.userList = data;
	     });		 
	 };
	 $scope.addUser = function() {
		 var modalInstance = $modal.open({
		      templateUrl: '/templates/userManagement/addUserTemplate.html',
		      controller: addUserTemplateCtrl,
		      resolve: {
		        
		      }
		    });
	 };
	 $scope.getTeamSpecificQuestions = function(){		 
		 $http.get('http://localhost:8080/SpringJDBCTemplate/getTeamSpecificQuestions').
	     success(function(data) {	    	
	         $scope.questionList = data;
	     });		 
	 };
	 $scope.getTeamSpecificQuestions();		
};

var addUserTemplateCtrl = function(){
	
	
};