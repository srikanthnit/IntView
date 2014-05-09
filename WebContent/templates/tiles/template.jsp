<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html ng-app>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title></title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="${pageContext.request.contextPath}/js/lib/bower_components/jquery/dist/jquery.min.js"></script>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/js/lib/bower_components/bootstrap/dist/css/bootstrap.min.css">
        <style>
            body {
                padding-top: 50px;
                padding-bottom: 20px;
            }
        </style>
       <link rel="stylesheet" href="${pageContext.request.contextPath}/js/lib/bower_components/bootstrap/dist/css/bootstrap-theme.min.css">
       <link href="${pageContext.request.contextPath}/css/main.css" rel="stylesheet">

        <script src="${pageContext.request.contextPath}/js/lib/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>
        
        <script src="${pageContext.request.contextPath}/js/lib/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath}/js/lib/bower_components/angular/angular.js"></script>
		<script src="${pageContext.request.contextPath}/js/lib/bower_components/jquery/dist/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/lib/plugins.js"></script>
        <script src="${pageContext.request.contextPath}/js/controllers/userManagementController.js"></script>
        <script src="${pageContext.request.contextPath}/js/main.js"></script>
    </head>
    <body>
        <!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
        
    <div class="container">
        <tiles:insertAttribute name="header" />
        <div class="content">
        	<div class="row">
        		<div class="col-md-3"><tiles:insertAttribute name="menu" /></div>
            	<div class="col-md-9"><tiles:insertAttribute name="body" /></div>
            </div>
        </div>
        <tiles:insertAttribute name="footer" />
    </div>
    </body>
</html>
