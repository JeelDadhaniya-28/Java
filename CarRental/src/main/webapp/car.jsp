<%@page import="car.bean.Car"%>
<%@page import="car.dao.CarDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<title>ROYAL CARS - Car Rental HTML Template</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta content="Free HTML Templates" name="keywords">
<meta content="Free HTML Templates" name="description">

<!-- Favicon -->
<link href="img/favicon.ico" rel="icon">

<!-- Google Web Fonts -->
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Oswald:wght@400;500;600;700&family=Rubik&display=swap"
	rel="stylesheet">

<!-- Font Awesome -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.0/css/all.min.css"
	rel="stylesheet">

<!-- Libraries Stylesheet -->
<link href="lib/owlcarousel/assets/owl.carousel.min.css"
	rel="stylesheet">
<link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css"
	rel="stylesheet" />

<!-- Customized Bootstrap Stylesheet -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

<!-- Template Stylesheet -->
<link href="css/style.css" rel="stylesheet">
</head>

<body>
	<!-- Page Header Start -->
	<div class="container-fluid page-header">
		<h1 class="display-3 text-uppercase text-white mb-3">Car Buying</h1>
		<div class="d-inline-flex text-white">
			<h6 class="text-uppercase m-0">
				<a class="text-white" href="">Home</a>
			</h6>
			<h6 class="text-body m-0 px-3">/</h6>
			<h6 class="text-uppercase text-body m-0">Buy Car</h6>
		</div>
	</div>
	<!-- Page Header End -->

	<%
	if (request.getAttribute("msg") != null) {
		out.println(request.getAttribute("msg"));
	}
	%>

	<!-- Rent A Car Start -->
	<div class="container-fluid py-5">
		<div class="container pt-5 pb-3">
			<h1 class="display-4 text-uppercase text-center mb-5">Buy The
				Car</h1>
			<div class="row">
				<%
				List<Car> list = CarDao.getAllCars();
				for (Car c : list) {
				%>
				<div class="col-lg-4 col-md-6 mb-2">
					<div class="rent-item mb-4">
						<img class="img-fluid mb-4"
							src="<%=request.getContextPath() + "/car_images/" + c.getCar_image()%>"
							alt="<%=c.getCar_image()%>">
						<h4 class="text-uppercase mb-4"><%=c.getCar_name()%></h4>
						<div class="d-flex justify-content-center mb-4">
							<div class="px-2">
								<i class="fa fa-car text-primary mr-1"></i> <span><%=c.getCar_fuel()%></span>
							</div>
							<div class="px-2 border-left border-right">
								<i class="fa fa-cogs text-primary mr-1"></i> <span><%=c.getCar_transmission()%></span>
							</div>
							<div class="px-2 border-left border-right"">
								<i class="fa fa-road text-primary mr-1"></i> <span><%=c.getCar_mileage()%>
									Mileage</span>
							</div>
							<div class="px-2">
								<i class="fa fa-inr text-primary mr-1"></i> <span><%=c.getCar_ppd()%>/Day
								</span>
							</div>
						</div>
						<a class="btn btn-primary px-5"
							href="car-single.jsp?cid=<%=c.getCid()%>">Details</a>
					</div>
				</div>
				<%
				}
				%>
			</div>
		</div>
	</div>
	<!-- Rent A Car End -->

	<%@ include file="footer.jsp"%>
</body>

</html>