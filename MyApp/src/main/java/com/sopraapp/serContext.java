package com.sopraapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class serContext
 */
@WebServlet("/serContext")
public class serContext extends HttpServlet {
	
	protected void doget(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	response.setContentType("text/html");	
	PrintWriter out=response.getWriter();
	ServletContext cnt=getServletContext();
	String dname=cnt.getInitParameter("dname");
	out.println("Database name"+dname);
	
	}

}
