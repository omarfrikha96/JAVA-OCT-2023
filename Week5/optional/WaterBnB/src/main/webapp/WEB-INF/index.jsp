<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>your title</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
 <p>Find places to swim and sleep on water bnb!</p>
<p><a href="/account">Sign Up/Sign In</a></p>
<c:if test = "${user!=null}">
   <p><a href="/logout">Log Out</a></p>
   <br>
   <p>Find your pool!</p>
</c:if>
<c:if test = "${user==null}">
   <p>Find places to swim and sleep on water bnb!</p>
</c:if>

<form action="/" method="post">
	<table>
	    <tbody>
			<tr>
				<td><input type = "text" name = "locationSearch"  class="input"></td>
				<td><input class="input" class="button" type="submit" value="Search"/></td>
			</tr>
	    </tbody>
	</table>
</form>

<c:if test = "${searchResults!=null}">
   <table>
    <thead> 
    	<tr>
    		<th>Address</th>
    		<th>Pool Size</th>
    		<th>Cost per Night</th>
    		<th>Details</th>
    	</tr>
    </thead>
    <tbody>
    	<c:forEach var="listing" items="${searchResults}">
		<tr>
			<td>${listing.location}</td>
			<td>${listing.size}	</td>
			<td>$${listing.price}</td>
			<td>Rating: ${listing.rating}/5 <a href="/pools/${listing.id}">See More</a></td>
		</tr>	
		</c:forEach>
    </tbody>
	</table>
</c:if>  
</body>
</html>