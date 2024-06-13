package com.controller;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.bean.User;
import com.dao.UserDao;

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("insert")) {
			if(request.getParameter("password").equals(request.getParameter("cpassword"))) {
				User u=new User();
				u.setFname(request.getParameter("fname"));
				u.setLname(request.getParameter("lname"));
				u.setEmail(request.getParameter("email"));
				u.setMobile(Long.parseLong(request.getParameter("mobile")));
				u.setPassword(request.getParameter("password"));
				
				UserDao.insertUser(u);
				request.setAttribute("msg", "Data Inserted Successfully.");
				request.getRequestDispatcher("Show.jsp").forward(request, response);
			}else {
				request.setAttribute("msg", "Password & Confirm Password Does Not Matched");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
			
		}
		else if(action.equalsIgnoreCase("edit")) {
			int id=Integer.parseInt(request.getParameter("id"));
			User u=UserDao.getUsers(id);
			request.setAttribute("u", u);
			request.getRequestDispatcher("Update.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("update")) {
			User u=new User();
			u.setId(Integer.parseInt(request.getParameter("id")));
			u.setFname(request.getParameter("fname"));
			u.setLname(request.getParameter("lname"));
			u.setEmail(request.getParameter("email"));
			u.setMobile(Long.parseLong(request.getParameter("mobile")));
			u.setPassword(request.getParameter("password"));
			
			UserDao.UpadetUser(u);
			request.setAttribute("msg", "Data Updated Successfully.");
			request.getRequestDispatcher("Show.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("delete")) {
			int id=Integer.parseInt(request.getParameter("id"));
			UserDao.DeleteUser(id);
			
			request.setAttribute("msg", "Data Delete Successfully.");
			request.getRequestDispatcher("Show.jsp").forward(request, response);
		}
	}

}
