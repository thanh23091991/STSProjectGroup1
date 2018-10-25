<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

</head>
<body>
	<h3>Table Car</h3>
			<h4>
				<c:out value="${deletedMsg}" />
			</h4>
			<h4>
				<c:out value="${updatedMsg}" />
			</h4>
			<h4>
				<c:out value="${insertedMsg}" />
			</h4>
			<a href="${pageContext.request.contextPath}/CarInsert.jsp"><button
					class="btn btn-outline-primary" value="Insert"
					style="float: left; margin-bottom: 5px">Insert</button></a>
			<table class="table table-hover table-bordered">
				<thead>
					<tr>
						<th scope="col">CarID</th>
						<th scope="col">Maker</th>
						<th scope="col">Model</th>
						<th scope="col">Year</th>
						<th scope="col">Color</th>
						<th scope="col">Note</th>
						<th scope="col">Update</th>
						<th scope="col">Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${carList}" var="car">
						<tr>
							<td><c:out value="${car.carId}" /></td>
							<td><c:out value="${car.maker}" /></td>
							<td><c:out value="${car.model}" /></td>
							<td><c:out value="${car.year}" /></td>
							<td><c:out value="${car.color}" /></td>
							<td><c:out value="${car.note}" /></td>
							<td><a
								href="${pageContext.request.contextPath}/updateCarById?carId=${car.carId}"><button
										class="btn btn-success" value="Update">Update</button></a></td>
							<td><a
								href="${pageContext.request.contextPath}/deleteCarById?carId=${car.carId}"><button
										class="btn btn-danger" value="Delete">Delete</button></a></td>
						</tr>
					</c:forEach>
				</tbody>
	

</body>
</html>