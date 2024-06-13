<%@page import="car.bean.UserSignUp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
		UserSignUp u=null;
		if(session != null)
		{
			if(session.getAttribute("u") != null)
			{
				u=(UserSignUp)session.getAttribute("u");
			}
		}
	%>
    
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
	
    


    <!-- Navbar Start -->
    <div class="container-fluid position-relative nav-bar p-0">
        <div class="position-relative px-lg-5" style="z-index: 9;">
            <nav class="navbar navbar-expand-lg bg-secondary navbar-dark py-3 py-lg-0 pl-3 pl-lg-5">
                <a href="" class="navbar-brand">
                    <h1 class="text-uppercase text-primary mb-1">Royal Cars</h1>
                </a>
                <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-between px-3" id="navbarCollapse">
                    <div class="navbar-nav ml-auto py-0">
                        <a href="index.jsp" class="nav-item nav-link active">Home</a>
                        
                        <div class="nav-item dropdown">
                            <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Cars</a>
                            <div class="dropdown-menu rounded-0 m-0">
                                <a href="add-car.jsp" class="dropdown-item">Add Car</a>
                                <a href="view-car.jsp" class="dropdown-item">View Car</a>
                                <a href="booking.jsp" class="dropdown-item">Car Booking</a>
                            </div>
                        </div>
                        
                       <!--  <div class="nav-item dropdown">
                            <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Pages</a>
                            <div class="dropdown-menu rounded-0 m-0">
                                <a href="team.jsp" class="dropdown-item">The Team</a>
                                <a href="testimonial.jsp" class="dropdown-item">Testimonial</a>
                            </div>
                        </div> -->
        
        <%
	    
		    if(u == null)
		    {
	    
	    %>
	    
				<a href="signup.jsp" class="nav-item nav-link"><span class="glyphicon glyphicon-user"></span> Sign Up</a>
				<a href="login.jsp" class="nav-item nav-link"><span class="glyphicon glyphicon-log-in"></span> Login</a>
	    
	    <%
	    
	    	}else{
	    
	    %>
	    	<div class="nav-item dropdown">
	    	
	    		<a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Profile</a>
	    		
                <div class="dropdown-menu rounded-0 m-0">
	    			<a href="changepassword.jsp" class="dropdown-item"><span class="glyphicon glyphicon-edit"></span> Change Password</a>
	    			<a href="logout.jsp" class="dropdown-item"><span class="glyphicon glyphicon-log-out"></span> Logout(<%=u.getFname() %>)</a>
	    		</div>
	    	</div>
	    <%
	    	}
	    %>
	    
                    </div>
                </div>
            </nav>
        </div>
    </div>
    <!-- Navbar End -->


   
</body>
</html>