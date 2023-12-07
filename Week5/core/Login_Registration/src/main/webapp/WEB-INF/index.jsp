<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>your title</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body>
	<h1>Welcome!</h1>
	<p>Join our growing community</p>

	<form:form action="/register" method="post" modelAttribute="newUser">

		<table>
			<thead>
				<tr>
					<td colspan="2">Register</td>
				</tr>
			</thead>
			<thead>
				<tr>
					<td class="float-left">Username:</td>
					<td class="float-left"><form:errors path="username"
							class="text-danger" /> <form:input class="input" path="username" />
					</td>
				</tr>
				<tr>
					<td class="float-left">Email:</td>
					<td class="float-left"><form:errors path="email"
							class="text-danger" /> <form:input class="input" path="email" type="email"/>
					</td>
				</tr>
				<tr>
					<td class="float-left">Password:</td>
					<td class="float-left"><form:errors path="password"
							class="text-danger" /> <form:input class="input" path="password" type="password" />
					</td>
				</tr>
				<tr>
					<td class="float-left">Confirm PW:</td>
					<td class="float-left"><form:errors path="confirm"
							class="text-danger" /> <form:input class="input" path="confirm"  type="password"/>
					</td>
				</tr>
				<tr>
					<td colspan=2><input class="input" type="submit"
						value="Submit" /></td>
				</tr>
			</thead>
		</table>
	</form:form>
	<hr>
	<form:form action="/login" method="post" modelAttribute="newLogin">

		<table>
			<thead>
				<tr>
					<td colspan="2">Log In</td>
				</tr>
			</thead>
			<thead>
				<tr>
					<td class="float-left">Email:</td>
					<td class="float-left"><form:errors path="email"
							class="text-danger" /> <form:input class="input" path="email" type="email"/>
					</td>
				</tr>
				<tr>
					<td class="float-left">Password:</td>
					<td class="float-left"><form:errors path="password"
							class="text-danger" /> <form:input class="input" path="password" type="password" />
					</td>
				</tr>
				<tr>
					<td colspan=2><input class="input" type="submit"
						value="Submit" /></td>
				</tr>
			</thead>
		</table>
	</form:form>
</body>
</html>