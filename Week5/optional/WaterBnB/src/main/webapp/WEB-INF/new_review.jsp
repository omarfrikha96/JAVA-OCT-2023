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
<h2><a href="/">Home</a></h2>
<h2><a href="/logout">Log Out</a></h2>

<form:form action="/pools/${listing.id}/review" method="post" modelAttribute="review">

	<table>
	    <thead>
	    	<tr>
	            <td colspan=2>Review of ${listing.location}</td>
	        </tr>
	        <tr>
	            <td class="float-left">Listing Description:</td>
	            <td class="float-left">
	            	<form:errors path="text" class="text-danger"/>
					<form:textarea rows="4" class="input" path="text"/>
	            </td>
	        </tr>
	        <tr>
	        	<td>
	        		<form:select path="rating" id="" name="" class="form-select">
		                <c:forEach var="num" items="${nums}">
	                    	<option value="${num}">${num}</option>
	                    </c:forEach>
		            </form:select>
	        	</td>
	        	<td><input class="input" type="submit" value="Submit Review"/></td>
	        </tr>
	    </thead>
	</table>
</form:form>
   
</body>
</html>