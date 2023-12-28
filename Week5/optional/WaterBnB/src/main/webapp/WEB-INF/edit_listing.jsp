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
   <h2><a href="/logout">Log Out</a></h2>

<form:form action="/host/pools/${listing.id}" method="post" modelAttribute="listing">

	<table>
	    <thead>
	    	<tr>
	            <td colspan=2>Edit Listing</td>
	        </tr>
	        <tr>
	            <td class="float-left">Email:</td>
	            <td class="float-left">
	            	${user.email}
	            </td>
	        </tr>
	        <tr>
	            <td class="float-left">Name:</td>
	            <td class="float-left">
	            	${user.firstName} ${user.lastName}
	            </td>
	        </tr>
	    	<tr>
	            <td class="float-left">Address:</td>
	            <td class="float-left">
	            	<form:errors path="location" class="text-danger"/>
					<form:textarea class="input" path="location"/>
	            </td>
	        </tr>
	        <tr>
	            <td class="float-left">Listing Description:</td>
	            <td class="float-left">
	            	<form:errors path="description" class="text-danger"/>
					<form:textarea rows="4" class="input" path="description"/>
	            </td>
	        </tr>
			<tr>
	            <td class="float-left">Cost per night:</td>
	            <td class="float-left">
	            	<form:errors path="price" class="text-danger"/>
					<form:input type="number" class="input" path="price"/>
	            </td>
	        </tr>
	        <tr>
	        	<td class="float-left">Pool Size:</td>
	        	<td class="float-left">
	        		<form:select path="size" id="" name="" class="form-select">
		                <option value="Small">Small</option>
						<option value="Medium">Medium</option>
						<option value="Large">Large</option>
		            </form:select>
	        	</td>
	        </tr>
	        <tr>
	        	<td colspan=2><input class="input" class="button" type="submit" value="Submit"/></td>
	        </tr>
	    </thead>
	</table>
</form:form>
<br>
Rating: ${listing.rating}/5

<iframe src="/reviews/${listing.id}" title="Reviews Iframe"></iframe>
</body>
</html>