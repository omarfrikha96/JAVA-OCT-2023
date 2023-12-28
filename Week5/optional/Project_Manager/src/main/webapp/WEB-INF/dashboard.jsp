<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Project Manager Dashboard</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body>

</body>
</html>

</head>
<body>

	<h1>Project Manager Dashboard</h1>
	<p>Welcome, ${user.firstName}</p>
	<p>
		<a href="/logout">Log Out</a>
	</p>
	<p>
		<a href="/projects/new">Add Project</a>
	</p>

	<h4>All Projects</h4>

	<table>
		<thead>
			<tr>
				<th>Project</th>
				<th>Team Lead</th>
				<th>Due Date</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="project" items="${unassignedProjects}">
				<tr>
					<c:if test="${project.lead.id!=user.id}">
						<td><a href="/projects/${project.id}">${project.title}</a></td>
						<td><c:out value="${project.lead.firstName}"></c:out></td>
						<td><fmt:formatDate value="${project.dueDate}"
								pattern="MMMM dd" /></td>
						<td><a href="/dashboard/join/${project.id}">Join Team</a></td>
					</c:if>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<hr>
	<h4>Your Projects</h4>
	<table>
		<thead>
			<tr>
				<th>Project</th>
				<th>Team Lead</th>
				<th>Due Date</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="project" items="${assignedProjects}">
				<tr>
					<td><a href="/projects/${project.id}">${project.title}</a></td>
					<td><c:out value="${project.lead.firstName}"></c:out></td>
					<td><fmt:formatDate value="${project.dueDate}"
							pattern="MMMM dd" /></td>
					<c:if test="${project.lead.id==user.id}">
						<td class="d-flex justify-content-between"><a href="/projects/edit/${project.id}" class="btn btn-primary">Edit</a>
							<form action="/projects/delete/${project.id}" method="post">
								<input type="hidden" name="_method" value="delete"> <input
									type="submit" value="Delete" class="btn btn-danger">
							</form></td>
					</c:if>
					<c:if test="${project.lead.id!=user.id}">
						<td><a href="/dashboard/leave/${project.id}">Leave Team</a></td>
					</c:if>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>