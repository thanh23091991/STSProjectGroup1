<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Page Title</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen" href="main.css" />
<link rel="stylesheet" type="text/css" media="screen"
	href="css/bootstrap.min.css" />
<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/main.js"></script>
<script src="js/ajax.js"></script>
</head>

<body>
<div class="alert "
                style="width: 180px; float: right; margin-bottom: 15px;padding-left:20px; height:100px">
                   <span class="text-success"> <c:out value="${welcomeMsg}" /></span> 

                <a href="${pageContext.request.contextPath}/logout"><button
                    class="btn btn-outline-danger" value="Logout"
                    style=" ">Logout</button></a>
            </div>
	<center>
		
		<div class="container">

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
						<th scope="col">Mã SV</th>
						<th scope="col">Tên SV</th>
						<th scope="col">Giới tính</th>
						<th scope="col">Ngày sinh</th>
						<th scope="col">Quê quán</th>
						<th scope="col">Mã lớp</th>
						<th scope="col">Cập nhật</th>
						<th scope="col">Xóa</th>
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
			</table>
			<h3>Table Customer</h3>
			<table class="table table-hover table-bordered">
				<thead>
					<tr>
						<th scope="col">#</th>
						<th scope="col">CustomerID</th>
						<th scope="col">Name</th>
						<th scope="col">Phone</th>
						<th scope="col">Email</th>
						<th scope="col">Address</th>
						<th scope="col">Note</th>
					</tr>
				</thead>
				<tbody id="customer">
				</tbody>
			</table>
			<h3>Table Order</h3>
			<table class="table table-hover table-bordered">
				<thead>
					<tr>
						<th scope="col">#</th>
						<th scope="col">OrderID</th>
						<th scope="col">CustomerID</th>
						<th scope="col">CarID</th>
						<th scope="col">Amount</th>
						<th scope="col">SalePrice</th>
						<th scope="col">OrderDate</th>
						<th scope="col">DeliveryAddress</th>
						<th scope="col">Status</th>
						<th scope="col">Note</th>
					</tr>
				</thead>
				<tbody id="order">
				</tbody>
			</table>
		</div>
	</center>
</body>
</html>