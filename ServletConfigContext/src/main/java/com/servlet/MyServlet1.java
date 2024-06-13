package com.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Driver;

public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String email;
	ServletConfig config;
	ServletContext context;
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Initialize");
		this.config=config;
		
		this.context=context.getServletContextName();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		email=config.getInitParameter("email");
		System.out.println("Email :"+email);
		String driver = context.getInitParameter("driver");
		System.out.println("Driver :"+driver);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
	}

	public void destroy() {
		System.out.println("Destroy");
	}
	
}
