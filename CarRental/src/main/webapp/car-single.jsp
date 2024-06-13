<%@page import="car.dao.CarDao"%>
<%@page import="car.bean.Car"%>
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
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
	
	<!-- Libraries Stylesheet -->
	<link href="lib/owlcarousel/assets/owl.carousel.min.css"
		rel="stylesheet">
	<link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css"
		rel="stylesheet" />
		
	<!-- Bootstrap CSS -->
	    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
	<!-- Bootstrap Icons CSS -->
	    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-icons/1.10.0/font/bootstrap-icons.min.css">
	
	<!-- Customized Bootstrap Stylesheet -->
	<link href="css/bootstrap.min.css" rel="stylesheet">
	
	<!-- Template Stylesheet -->
	<link href="css/style.css" rel="stylesheet">
</head>

<body>

	<!-- Page Header Start -->
	<div class="container-fluid page-header">
		<h1 class="display-3 text-uppercase text-white mb-3">Car Details</h1>
		<div class="d-inline-flex text-white">
			<h6 class="text-uppercase m-0">
				<a class="text-white" href="">Home</a>
			</h6>
			<h6 class="text-body m-0 px-3">/</h6>
			<h6 class="text-uppercase text-body m-0">Car Details</h6>
		</div>
	</div>
	<!-- Page Header End -->

	<%
	int cid = Integer.parseInt(request.getParameter("cid"));
	Car c = CarDao.getCars(cid);
	%>

	<!-- Detail Start -->
	<div class="container-fluid pt-5">
		<div class="container pt-5 pb-8">

			<h3 class="display-6 text-uppercase mb-1"><%=c.getCar_company()%></h3>
			<h1 class="display-4 text-uppercase mb-5"><%=c.getCar_name()%></h1>

			<div class="row align-items-center pb-8">
				<div class="col-lg-4 mb-4">
					<img class="img-fluid"
						src="<%=request.getContextPath() + "/car_images/" + c.getCar_image()%>"
						alt="<%=c.getCar_image()%>">
				</div>
				<div class="col-lg-6 mb-12">

					<h4 class="mb-2">
						<i class="fa fa-inr text-primary"></i>
						<span><%=c.getCar_ppd()%>/Day
						</span>
					</h4> <br>

					<div class="row mt-n1 mt-lg-10 pb-1" style="display: block;">
						<div class="col-md-12 col-6 mb-2" style="height: 50px; width: 300px">
							<i class="fa fa-car text-primary mr-4"></i><br> <span><%=c.getCar_fuel()%></span>
						</div>
						<div class="col-md-12 col-6 mb-2" style="height: 50px; width: 300px">
							<i class="fa fa-cogs text-primary mr-4"></i><br> <span><%=c.getCar_transmission()%></span>
						</div>
						<div class="col-md-12 col-6 mb-2" style="height: 50px; width: 300px">
							<i class="fa fa-road text-primary mr-4"></i><br> <span><%=c.getCar_mileage()%>
								Mileage</span>
						</div>

						<div class="col-md-12 col-6 mb-2" style="height: 50px; width: 300px">
						<i class="fa-solid fa-user" style="color:#F77D0A;"></i><br>
							<!-- <i class="mi mi-person text-primary mr-4"></i><br>  -->
							<span><%=c.getCar_capacity()%>
								Capacity</span>
						</div>
						<div class="col-md-12 col-6 mb-2" style="height: 50px; width: 300px">
						<i class="fa-solid fa-suitcase-rolling" style="color: #f77d0a;"></i><br>
							<!-- <i class="bi bi-luggage text-primary mr-4"></i><br> --> 
							<span><%=c.getCar_luggage_cap()%>
								Luggage Capacity</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Detail End -->

	<%
	if (u != null) {
	%>

	<form action="BookingController" method="post"
		enctype="multipart/form-data">
		<input type="hidden" name="id" value="<%=u.getId()%>"> 
		<input type="hidden" name="cid" value="<%=c.getCid()%>">
		<input type="hidden" name="car_ppd2" value="<%=c.getCar_ppd() %>">

		<!-- Car Booking Start -->
		<div class="container-fluid pb-5">
			<div class="container">
				<div class="row">
					<div class="col-lg-8">
						<h2 class="mb-4">Personal Detail</h2>
						<div class="mb-5">
							<div class="row">
								<div class="col-6 form-group">
									<input type="text" class="form-control p-4"
										value="<%=u.getFname()%>" name="fname" required="required">
								</div>
								<div class="col-6 form-group">
									<input type="text" class="form-control p-4"
										value="<%=u.getLname()%>" name="lname" required="required">
								</div>
							</div>
						</div>

						<h2 class="mb-4">Booking Detail</h2>

						<div class="mb-5">
							<div class="row">
								<div class="col-6 form-group">
									<input type="date"
										class="form-control p-4 datetimepicker-input" name="from_date"
										placeholder="From Date" data-target="#date2"
										data-toggle="datetimepicker" onclick="this.showPicker()" />
								</div>
								<!--    <div class="col-6 form-group">
	                                <div class="time" id="time2" data-target-input="nearest">
	                                    <input type="text" class="form-control p-4 datetimepicker-input" placeholder="From Time"
	                                        data-target="#time2" data-toggle="datetimepicker" />
	                                </div>
	                            </div> -->
							</div>

							<div class="row">
								<div class="col-6 form-group">
									<input type="date"
										class="form-control p-4 datetimepicker-input" name="to_date"
										placeholder="To Date" data-target="#date2"
										data-toggle="datetimepicker" onclick="this.showPicker()" />
								</div>
							</div>

							<p style="margin-left: 20px;">Enter your Driving licenc photo</p>

							<div class="row">
								<div class="mb-3 ml-3">
									<input name="identify_document" class="form-control" type="file" id="formFile" style="height:49px;padding: 10px;width: 350px;">
								</div>
							</div>

						</div>
					</div>
					
					<div style="margin-left: 350px;">
						<button class="btn btn-block btn-primary py-3"
								value="reserve now" name="action">Reserve Now</button>
					</div>
					
				</div>
			</div>
		</div>
	</form>
	<!-- Car Booking End -->

	<%
	} else {
	%>
	<div style="margin-left: 600px">
		<a class="btn btn-primary px-5 py-3 md-4" href="login.jsp">LOGIN</a>
	</div>
	<%
	}
	%>
	<!-- Vendor Start -->
	<div class="container-fluid py-5">
		<div class="container py-5">
			<div class="owl-carousel vendor-carousel">
				<div class="bg-light p-4">
					<img src="img/vendor-1.png" alt="">
				</div>
				<div class="bg-light p-4">
					<img src="img/vendor-2.png" alt="">
				</div>
				<div class="bg-light p-4">
					<img src="img/vendor-3.png" alt="">
				</div>
				<div class="bg-light p-4">
					<img src="img/vendor-4.png" alt="">
				</div>
				<div class="bg-light p-4">
					<img src="img/vendor-5.png" alt="">
				</div>
				<div class="bg-light p-4">
					<img src="img/vendor-6.png" alt="">
				</div>
				<div class="bg-light p-4">
					<img src="img/vendor-7.png" alt="">
				</div>
				<div class="bg-light p-4">
					<img src="img/vendor-8.png" alt="">
				</div>
			</div>
		</div>
	</div>
	<!-- Vendor End -->

	<%@ include file="footer.jsp"%>
</body>

</html>