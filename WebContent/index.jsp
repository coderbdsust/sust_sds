<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
<link
	href="<%=request.getContextPath()%>/resources/bootstrap/css/bootstrap.css"
	type="text/css" rel="stylesheet" media="screen,projection" />
<link
	href="<%=request.getContextPath()%>/resources/bootstrap/css/bootstrap.min.css"
	type="text/css" rel="stylesheet" media="screen,projection" />
<script
	src="<%=request.getContextPath()%>/resources/bootstrap/js/bootstrap.js"></script>
<script
	src="<%=request.getContextPath()%>/resources/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>Student Profiles</h2>
		<%
			
		%>
		<a href="<%=request.getContextPath()%>/student/entry">Create New
			Profile</a>
		<table class="table">
			<thead>
				<tr>
					<th>Name</th>
					<th>Registration No</th>
					<th>Cgpa</th>
					<th>#</th>
					<th>#</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${students}" var="student">
					<tr>
						<td>${student.studentName}</td>
						<td>${student.regNo}</td>
						<td>${student.cgpa}</td>
						<td><a
							href="<%=request.getContextPath()%>/student/update?studentId=${student.studentId}">Edit</a></td>
						<td><a
							href="<%=request.getContextPath()%>/student/del?studentId=${student.studentId}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
</body>
</html>