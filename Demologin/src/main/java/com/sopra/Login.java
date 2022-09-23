package com.sopra;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");		
	  String user=request.getParameter("user_name");
	  String pass=request.getParameter("password");
	  if(user.equals("sopra")&& pass.equals("12345"))
	  {
		  HttpSession ses=request.getSession();
		  ses.setAttribute("username", user);
		  response.sendRedirect("success.jsp");
	  }
	  else
	  {
		  out.println("<h1>Invalid Username and Password</h1>");
		  RequestDispatcher req=request.getRequestDispatcher("index.jsp");
		  req.include(request, response);
	  }
	}

}
