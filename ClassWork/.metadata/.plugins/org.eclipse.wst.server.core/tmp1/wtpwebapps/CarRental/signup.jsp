<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
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
    <link href="https://fonts.googleapis.com/css2?family=Oswald:wght@400;500;600;700&family=Rubik&display=swap" rel="stylesheet"> 

    <!-- Font Awesome -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.0/css/all.min.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
    <link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

    <!-- Customized Bootstrap Stylesheet -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Template Stylesheet -->
    <link href="css/style.css" rel="stylesheet">
</head>

<body>
    <!-- Page Header Start -->
    <div class="container-fluid page-header">
        <h1 class="display-3 text-uppercase text-white mb-3">Sign Up</h1>
        <div class="d-inline-flex text-white">
            <h6 class="text-uppercase m-0"><a class="text-white" href="index.jsp">Home</a></h6>
            <h6 class="text-body m-0 px-3">/</h6>
            <h6 class="text-uppercase text-body m-0">Contact</h6>
        </div>
    </div>
    <!-- Page Header End -->


    <!-- Contact Start -->
    <div class="container-fluid py-5">
        <div class="container pt-5 pb-3">
            <h1 class="display-4 text-uppercase text-center mb-5">Sign Up</h1>
            <div class="row">
            
            <%
				if(request.getAttribute("msg") != null){
			%>
				<h3> <%=request.getAttribute("msg") %> </h3>
			<%		
				}
			%>
            
                <div class="col-lg-7 mb-2">
                    <div class="contact-form bg-light mb-4" style="padding: 30px;">
                    
                    <%
                    
                    	if(request.getAttribute("msg") != null){
                    		out.println(request.getAttribute("msg"));
                    	}
                    
                    %>
                    
                        <form name="frm" method="post" action="UserSignUpController">
                            <div class="row">
                            	<div class="col-6 form-group">
                                    <select name="usertype" >
                                    	<option>--- Select User Type ---</option>
                                    	<option value="Owner">Owner</option>
                                    	<option value="Customer">Customer</option>
                                    </select>
                                </div>
                                <div class="col-6 form-group">
                                    <input type="text" class="form-control p-4" placeholder="Your First Name" required="required" name="fname">
                                </div>
                                <div class="col-6 form-group">
                                    <input type="text" class="form-control p-4" placeholder="Your Last Name" required="required" name="lname">
                                </div>
                                <div class="col-6 form-group">
                                    <input type="email" class="form-control p-4" placeholder="Your Email" required="required" name="email">
                                </div>
                                <div class="col-6 form-group">
                                    <input type="number" class="form-control p-4" placeholder="Your Mobile Number" required="required" name="mobile">
                                </div>
                                <div class="col-6 form-group">
                                    <input type="password" class="form-control p-4" placeholder="Your Password" required="required" name="password">
                                </div>
                                <div class="col-6 form-group">
                                    <input type="password" class="form-control p-4" placeholder="Your Confirm Password" required="required" name="cpassword">
                                </div>
                            </div>
 <!-- <div class="form-group">
     <input type="text" class="form-control p-4" placeholder="Subject" required="required">
 </div>
 <div class="form-group">
     <textarea class="form-control py-3 px-4" rows="5" placeholder="Message" required="required"></textarea>
 </div> -->
                            <div>
                                <button class="btn btn-primary py-3 px-5" type="submit" value="Sign Up" name="action">Sign Up</button>
                            </div>
                        </form>
                    </div>
                </div>
<!-- <div class="col-lg-5 mb-2">
    <div class="bg-secondary d-flex flex-column justify-content-center px-5 mb-4" style="height: 435px;">
        <div class="d-flex mb-3">
            <i class="fa fa-2x fa-map-marker-alt text-primary flex-shrink-0 mr-3"></i>
            <div class="mt-n1">
                <h5 class="text-light">Head Office</h5>
                <p>123 Street, New York, USA</p>
            </div>
        </div>
        <div class="d-flex mb-3">
            <i class="fa fa-2x fa-map-marker-alt text-primary flex-shrink-0 mr-3"></i>
            <div class="mt-n1">
                <h5 class="text-light">Branch Office</h5>
                <p>123 Street, New York, USA</p>
            </div>
        </div>
        <div class="d-flex mb-3">
            <i class="fa fa-2x fa-envelope-open text-primary flex-shrink-0 mr-3"></i>
            <div class="mt-n1">
                <h5 class="text-light">Customer Service</h5>
                <p>customer@example.com</p>
            </div>
        </div>
        <div class="d-flex">
            <i class="fa fa-2x fa-envelope-open text-primary flex-shrink-0 mr-3"></i>
            <div class="mt-n1">
                <h5 class="text-light">Return & Refund</h5>
                <p class="m-0">refund@example.com</p>
            </div>
        </div>
    </div>
</div> -->
            </div>
        </div>
    </div>
    <!-- Contact End -->


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
    
<%@ include file="footer.jsp" %>
</body>

</html>