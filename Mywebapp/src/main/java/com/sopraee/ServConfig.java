package com.sopraee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServConfig
 */
@WebServlet("/ServConfig")
public class ServConfig extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig conf=getServletConfig();
		String data=conf.getInitParameter("sopra");
		PrintWriter out=response.getWriter();
		out.println(data);
		
	}

}
