/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2024-05-25 07:38:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import tops.bean.Emp;

public final class forgot_002dpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/header.jsp", Long.valueOf(1716271304841L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("tops.bean.Emp");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");

	Emp e=null;
	if(session != null)
	{
		if(session.getAttribute("e") != null)
		{
			e=(Emp)session.getAttribute("e");
		}
	}

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("	<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\r\n");
      out.write("	<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("	  <div class=\"container-fluid\">\r\n");
      out.write("	    <div class=\"navbar-header\">\r\n");
      out.write("	      <a class=\"navbar-brand\" href=\"index.jsp\">GemsCart</a>\r\n");
      out.write("	    </div>\r\n");
      out.write("	    <ul class=\"nav navbar-nav\">\r\n");
      out.write("	      <li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("	      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Courses <span class=\"caret\"></span></a>\r\n");
      out.write("	        <ul class=\"dropdown-menu\">\r\n");
      out.write("	          <li><a href=\"#\">JAVA</a></li>\r\n");
      out.write("	          <li><a href=\"#\">Python</a></li>\r\n");
      out.write("	          <li><a href=\"#\">Java Script</a></li>\r\n");
      out.write("	        </ul>\r\n");
      out.write("	      </li>\r\n");
      out.write("	      <li><a href=\"#\">Page 2</a></li>\r\n");
      out.write("	    </ul>\r\n");
      out.write("	    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("	    \r\n");
      out.write("	    ");

	    
		    if(e==null)
		    {
	    
	    
      out.write("\r\n");
      out.write("	    \r\n");
      out.write("				<li><a href=\"signup.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\r\n");
      out.write("				<li><a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\r\n");
      out.write("	    \r\n");
      out.write("	    ");

	    
	    	}else{
	    
	    
      out.write("\r\n");
      out.write("	    		<li><a href=\"change-password.jsp\"><span class=\"glyphicon glyphicon-edit\"></span> Change Password</a></li>\r\n");
      out.write("	    		<li><a href=\"logout.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span> Logout(");
      out.print(e.getFname() );
      out.write(")</a></li>\r\n");
      out.write("	    ");

	    
	    	}
	    
	    
      out.write("\r\n");
      out.write("	    \r\n");
      out.write("	    </ul>\r\n");
      out.write("	  </div>\r\n");
      out.write("	</nav>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Login</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	tr,td{\r\n");
      out.write("		padding: 10px;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");

		if(request.getAttribute("msg") != null)
		{
	
      out.write("\r\n");
      out.write("	<h2>");
      out.print(request.getAttribute("msg") );
      out.write("</h2>\r\n");
      out.write("	");

		}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<form name=\"frm\" method=\"post\" action=\"EmpController\">\r\n");
      out.write("		<table>\r\n");
      out.write("			\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Enter Email :-</td>\r\n");
      out.write("				<td><input type=\"email\" name=\"email\"> </td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td colspan=\"2\" align=\"center\">\r\n");
      out.write("					<input type=\"submit\" name=\"action\" value=\"Send OTP\" class=\"btn btn-primary\">\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			\r\n");
      out.write("		</table>\r\n");
      out.write("	</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
