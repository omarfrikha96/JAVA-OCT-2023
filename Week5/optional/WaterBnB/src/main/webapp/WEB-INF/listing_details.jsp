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
 <p><a href="/">Home</a></p>
<p><a href="/logout">Log Out</a></p>

<table>
    <tbody>
		<tr>
			<td class="float-left">${listing.location}</td>
			<td class="float-left">Email: ${listing.host.email}</td>
		</tr>
		<tr>
			<td rowspan=3 class="float-left">${listing.description}</td>
			<td class="float-left">Name: ${listing.host.firstName} ${listing.host.lastName}</td>
		</tr>
		<tr>
			<td class="float-left">Pool Size: ${listing.size}</td>
		</tr>
		<tr>
			<td class="float-left">Cost: $${listing.price}</td>
		</tr>	
		<tr>
			<td class="float-left">Rating: ${listing.rating}/5</td>
			<c:if test = "${user==null}">
			   <td class="float-right">Sign in to leave a review</td>
			</c:if>
			<c:if test = "${user!=null}">
			   <td class="float-right"><a href="/pools/${listing.id}/review">Leave a review</a></td>
			</c:if>
		</tr>	
    </tbody>
</table>

<iframe src="/reviews/${listing.id}" title="Reviews Iframe"></iframe>
   
</body>
</html>