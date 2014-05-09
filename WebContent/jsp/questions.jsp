<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
 
<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">
    
    <div class="bodyDiv_main img-rounded panel">
       <!-- Main jumbotron for a primary marketing message or call to action -->
       <div class="questionList_main" ng-controller="userManagement">
       		<div class="questionList_head">
       			<h4 style="float: left">Question List</h4>
       			<button class="btn btn-default" style="float: right;" ng-click="addQuestion()">Add Question</button>
       		</div>
       		<hr/>
       		<div class="questionList_body">
       			<table class="table">
	       			<thead>
	       				<tr>
	       					<th>Question</th>
	       					<th>Experience</th>
	       					<th>Complexity</th>
	       					<th>Technology</th>
	       					<th>Edit</th>
	       					<th>Delete</th>
	       				</tr>
	       			</thead>
	       			<tbody ng-repeat = "question in questionList">
	       				<tr>
	       					<td>{{question.question}}</td>
	       					<td>{{question.experience}}</td>
	       					<td>{{question.toughnessFactor}}</td>
	       					<td>{{question.technology}}</td>
	       					<td><a data-userId="{{question.questionId}}">Edit</a></td>
	       					<td><a data-userId="{{question.questionId}}">Delete</a></td>
	       				</tr>
	       			</tbody>
	       		</table>
       		</div>       		
       </div>	    
     </div>
    </tiles:putAttribute>
</tiles:insertDefinition>