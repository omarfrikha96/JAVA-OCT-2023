<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OMIKUJI</title>
<link rel="stylesheet" type="text/css" href="/css/style1.css">
</head>
<body>
	<h4>Send an OMIKUJI</h4>
	<div>
		<form action="/processOm" method="POST">
			
				
			<label for="number">Pick any number from 5 To 25:</label>
			<input type="number" name="number" /> 
				<br><br>	
			<label for="cityName">Enter the name of any city:</label>
			<input name="cityName" />
	<br><br>
			<label for="personName"> Enter the name of any Real Person:</label>
			<input name="personName" /> 
				<br><br>
			<label for="hobby">Enter professional endeavor or Hobby:</label>
			<input name="hobby" /> <br />
				<br><br>
			<label for="livingThing">Enter any type of living thing:</label>
			<input name="livingThing" /> 
				<br><br>
			<label for="someThing">Say something nice to someone:</label>
			<input name="someThing" /> 
			
			<br /> <br /> 
			Send And Show a Friend 
			<br />
			<button>Send</button>
		</form>


	</div>
</body>
</html>