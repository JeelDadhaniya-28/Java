package com.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	String email,driver;
	ServletConfig config;
	ServletContext context;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Initialize");
		this.config=config;
		this.context=config.getServletContext();
	}
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		email=config.getInitParameter("email");
		System.out.println("Email :"+email);
		
		driver=context.getInitParameter("driver");
		System.out.println("Driver :"+driver);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost"); 
	}
	
	public void destroy() {
		System.out.println("Destroy");
	}

}
