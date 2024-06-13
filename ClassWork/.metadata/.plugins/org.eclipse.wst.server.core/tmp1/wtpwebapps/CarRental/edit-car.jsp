<%@page import="car.dao.CarDao"%>
<%@page import="car.bean.Car"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="owner-header.jsp"%>
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

<!-- Template Stylesheet -->
<link href="css/style.css" rel="stylesheet">
</head>

<body>
	<!-- Page Header Start -->
	<div class="container-fluid page-header">
		<h1 class="display-3 text-uppercase text-white mb-3">Edit Car</h1>
		<div class="d-inline-flex text-white">
			<h6 class="text-uppercase m-0">
				<a class="text-white" href="index.jsp">Home</a>
			</h6>
			<h6 class="text-body m-0 px-3">/</h6>
			<h6 class="text-uppercase text-body m-0">Edit Car</h6>
		</div>
	</div>
	<!-- Page Header End -->


	<!-- Contact Start -->
	<div class="container-fluid py-5">
		<div class="container pt-5 pb-3">
			<h1 class="display-4 text-uppercase text-center mb-5">Edit Car</h1>
			<div class="row">

				<%
				if (request.getAttribute("msg") != null) {
				%>
				<h3>
					<%=request.getAttribute("msg")%>
				</h3>
				<%
				}
				%>

				<div class="col-lg-7 mb-2">
					<div class="contact-form bg-light mb-4" style="padding: 30px;">

						<%
						int cid = Integer.parseInt(request.getParameter("cid"));
						Car c = CarDao.getCars(cid);

						if (request.getAttribute("msg") != null) {
							out.println(request.getAttribute("msg"));
						}
						%>

						<form name="frm" method="post" action="CarController"
							enctype="multipart/form-data">
							<input type="hidden" name="cid" value="<%=c.getCid()%>">
							<div class="row">

								<div class="col-6 form-group">
									<input type="text" class="form-control p-4"
										value="<%=c.getCar_company()%>" required="required"
										name="car_company">
								</div>
								<div class="col-6 form-group">
									<input type="text" class="form-control p-4"
										value="<%=c.getCar_name()%>" required="required"
										name="car_name">
								</div>
								<div class="col-6 form-group">
									<input type="number" class="form-control p-4"
										value="<%=c.getCar_mileage()%>" required="required"
										name="car_mileage">
								</div>

								<div class="col-6 form-group">
									<select name="car_transmission">
										<option value="<%=c.getCar_transmission()%>"><%=c.getCar_transmission()%>
										</option>
										<option value="Auto">Auto</option>
										<option value="Manual">Manual</option>
										<option value="Hybrid">Hybrid</option>
									</select>
								</div>

								<div class="col-6 form-group">
									<input type="number" class="form-control p-4"
										value="<%=c.getCar_capacity()%>" required="required"
										name="car_capacity">
								</div>
								<div class="col-6 form-group">
									<input type="number" class="form-control p-4"
										value="<%=c.getCar_luggage_cap()%>" required="required"
										name="car_luggage_cap">
								</div>

								<div class="col-6 form-group">
									<select name="car_fuel">
										<option value="<%=c.getCar_fuel()%>">
											<%=c.getCar_fuel()%>
										</option>
										<option value="Petrol">Petrol</option>
										<option value="Diesel">Diesel</option>
										<option value="CNG">CNG</option>
										<option value="Electric">Electric</option>
									</select>
								</div>

								<div class="col-6 form-group">
									<input type="file" placeholder="Your Car Image"
										required="required" name="car_image">
								</div>

								<div class="col-6 form-group">
									<input type="number" class="form-control p-4"
										value="<%=c.getCar_ppd()%>" required="required"
										name="car_ppd">
								</div>

							</div>

							<div>
								<!-- <button class="btn btn-primary py-3 px-5" value="add car" type="submit" name="action"></button> -->
								<button class="btn btn-primary py-3 px-5" type="submit"
									value="update car" name="action">Update Car</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Contact End -->

	<%@ include file="footer.jsp"%>
</body>

</html>