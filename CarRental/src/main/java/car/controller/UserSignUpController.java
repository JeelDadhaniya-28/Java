package car.controller;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Random;

import car.bean.UserSignUp;
import car.dao.UserSignUpDao;
import car.services.Services;

public class UserSignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("sign up"))
		{
			boolean flag=UserSignUpDao.checkEmail(request.getParameter("email"));
			
			if(flag == false)
			{
				if(request.getParameter("password").equals(request.getParameter("cpassword"))) 
				{
					UserSignUp u=new UserSignUp();
					u.setFname(request.getParameter("fname"));
					u.setLname(request.getParameter("lname"));
					u.setEmail(request.getParameter("email"));
					u.setMobile(Long.parseLong(request.getParameter("mobile")));
					u.setPassword(request.getParameter("password"));
					u.setUsertype(request.getParameter("usertype"));
					
					UserSignUpDao.signupUser(u);
					
					request.setAttribute("msg", "Sign Up Successfully.");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
				else
				{
					request.setAttribute("msg", "Password & Confirm Password does Not Match.");
					request.getRequestDispatcher("signup.jsp").forward(request, response);
				}
			}
			else
			{
				request.setAttribute("msg", "Email Already Registered.");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
		
		else if(action.equalsIgnoreCase("log in")) {
			UserSignUp u=UserSignUpDao.UserLogin(request.getParameter("email"));
			if(u!=null)
			{
				if(u.getPassword().equals(request.getParameter("password")))
				{
					HttpSession session=request.getSession();
					session.setAttribute("u", u);
					
					if(u.getUsertype().equals("Owner"))
					{
						request.getRequestDispatcher("owner-index.jsp").forward(request, response);
					}
					else
					{
						request.getRequestDispatcher("index.jsp").forward(request, response);
					}
				}
				else
				{
					request.setAttribute("msg", "Incorrect Password!");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			}
			else
			{
				request.setAttribute("msg", "Email Not Registered");
				request.getRequestDispatcher("signup.jsp").forward(request, response);
			}			
		}
		
		else if(action.equalsIgnoreCase("changepassword")) {
			HttpSession session=request.getSession();
			UserSignUp u=(UserSignUp)session.getAttribute("u");
			
			if(u.getPassword().equals(request.getParameter("oldpassword")))
			{
				if(request.getParameter("newpassword").equals(request.getParameter("cpassword")))
				{
					UserSignUpDao.ChangePass(u.getEmail(), request.getParameter("newpassword"));
					response.sendRedirect("logout.jsp");
				}
				else
				{
					request.setAttribute("msg", "New Password & Confirm Password Does Not Match.");
					request.getRequestDispatcher("changepassword.jsp").forward(request, response);
				}
			}
			else
			{
				request.setAttribute("msg", "Old Password Does Not Match.");
				request.getRequestDispatcher("changepassword.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("send otp"))
		{
//			System.out.println(request.getParameter("email_id"));
			String email =request.getParameter("email_id");
			boolean flag=UserSignUpDao.checkEmail(email);
			if(flag == true)
			{
//				System.out.println("Inside Send OTP");
				Random t = new Random();
		    	int minRange = 1000, maxRange= 9999;
	        	int otp = t.nextInt(maxRange - minRange) + minRange;
	        	Services.sendMail(email, otp);
	        	request.setAttribute("otp1", otp);
	        	request.setAttribute("email2",email);
	        	request.getRequestDispatcher("otp.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("msg", "Email Not Registered");
				request.getRequestDispatcher("forgot-password.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("verify otp")) 
		{
			int otp1=Integer.parseInt(request.getParameter("otp1"));
			int otp2=Integer.parseInt(request.getParameter("otp2"));
			String email=request.getParameter("email_id");
			System.out.println("Verify OTP "+email);
			
			if(otp1 == otp2)
			{
				request.setAttribute("email", email);
				request.getRequestDispatcher("new-password.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("msg", "Invalid OTP.");
				request.setAttribute("otp1", otp1);
	        	request.setAttribute("email", request.getParameter("email"));
				request.getRequestDispatcher("otp.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("updatepassword")) 
		{
			
			String email=request.getParameter("email_id");
			if(request.getParameter("newpassword").equals(request.getParameter("cpassword")))
			{
				UserSignUpDao.ChangePass(email, request.getParameter("newpassword"));
				request.setAttribute("msg", "Password Updated Successfully.");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("msg", "New Password & Confirm Password Does Not Matched.");
				request.setAttribute("email", request.getParameter("email"));
				request.getRequestDispatcher("new-password.jsp").forward(request, response);
			}
		}
	}

}
