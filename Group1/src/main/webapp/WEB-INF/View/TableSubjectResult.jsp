<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

</head>
<body>
	<h3>Table Subjects</h3>
			<h4>
				<c:out value="${deletedMsg}" />
			</h4>
			<h4>
				<c:out value="${updatedMsg}" />
			</h4>
			<h4>
				<c:out value="${insertedMsg}" />
			</h4>
			<a href="insSubInfo"><button
					class="btn btn-outline-primary" value="Insert">Insert</button></a>
			<table class="table table-hover table-bordered">
				<thead>
					<tr>
						<th scope="col">MaMH</th>
						<th scope="col">TenMH</th>
						<th scope="col">SoTrinh</th>
						<th scope="col">Update</th>
						<th scope="col">Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${subjectlist}" var="subject">
						<tr>
							<td><c:out value="${subject.maMH}" /></td>
							<td><c:out value="${subject.tenMH}" /></td>
							<td><c:out value="${subject.soTrinh}" /></td>
							<td><a
								href="${pageContext.request.contextPath}/updateCarById?carId=${subject.maMH}"><button
										class="btn btn-success" value="Update">Update</button></a></td>
							<td><a
								href="${pageContext.request.contextPath}/subjectDelete/${subject.maMH}"><button
										class="btn btn-danger" value="Delete">Delete</button></a></td>
						</tr>
					</c:forEach>
				</tbody>
	

</body>
</html>