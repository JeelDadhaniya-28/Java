package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.bean.Emp;
import com.dao.EmpDao;

public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("sign up"))
		{
			boolean flag=EmpDao.checkEmail(request.getParameter("email"));
			if(flag==false)
			{
				if(request.getParameter("password").equals(request.getParameter("cpassword")))
				{
					Emp e=new Emp();
					e.setFname(request.getParameter("fname"));
					e.setLname(request.getParameter("lname"));
					e.setEmail(request.getParameter("email"));
					e.setMobile(Long.parseLong(request.getParameter("mobile")));
					e.setPassword(request.getParameter("password"));
					EmpDao.signupEmp(e);
					request.setAttribute("msg", "Emp Sign Up Successfully");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
				else
				{
					request.setAttribute("msg", "Password & Confirm Password Does Not Matched");
					request.getRequestDispatcher("signup.jsp").forward(request, response);
				}
			}
			else
			{
				request.setAttribute("msg", "Email Already Registered");
				request.getRequestDispatcher("signup.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("login"))
		{
			Emp e=EmpDao.loginEmp(request.getParameter("email"));
			if(e!=null)
			{
				if(e.getPassword().equals(request.getParameter("password")))
				{
					HttpSession session=request.getSession();
					session.setAttribute("e", e);
					request.getRequestDispatcher("index.jsp").forward(request, response);
				}
				else
				{
					request.setAttribute("msg", "Incorrect Password");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			}
			else
			{
				request.setAttribute("msg", "Email Not Registered");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("change password"))
		{
			HttpSession session=request.getSession();
			Emp e=(Emp)session.getAttribute("e");
			if(e.getPassword().equals(request.getParameter("old_password")))
			{
				if(request.getParameter("new_password").equals(request.getParameter("cnew_password")))
				{
					EmpDao.changePassword(e.getEmail(), request.getParameter("new_password"));
					response.sendRedirect("logout.jsp");
				}
				else
				{
					request.setAttribute("msg", "New Password & Confirm New Password Does Not Matched");
					request.getRequestDispatcher("change-password.jsp").forward(request, response);
				}
			}
			else
			{
				request.setAttribute("msg", "Old Password Does Not Matched");
				request.getRequestDispatcher("change-password.jsp").forward(request, response);
			}
		}
	}

}
