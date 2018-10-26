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

<center>
		<div class="container">
			<form action="${pageContext.request.contextPath}/doinsertCar" method="post" class="form">
			<h3>Insert Car</h3>
			MaMH <input name="maMH" class="form-control" type=text />
			TenMH <input name="tenMH" class="form-control" type=text/> 
			SoTrinh <input name="sotrinh" class="form-control" type=text />
	        <div>
	        	<p name="alert" style="color: red">
					<c:out value="${insertMsg}" />
				</p>
	        </div>
	        <input type="submit" value= "Insert" class= "btn btn-success">
			</form>
		</div>
	</center>

</body>
</html>