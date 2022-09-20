package com.nt.servlet;
//import javax.servlet.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;

import java.time.LocalDateTime;


@SuppressWarnings("serial")
public class WishMessageServlet extends HttpServlet {
	

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	//get printWriter
		PrintWriter pw=res.getWriter();
		
	//set response content type
		res.setContentType("text/html");
		
		//write business logic to generate the WishMessage
		LocalDateTime ldt=LocalDateTime.now();//give current Date and Time
		int hour=ldt.getHour();
		    pw.println("<h1 style='color:red;text-align:center'>"+ldt.toString()+"</h1>");
		if(hour<12) 
			pw.println("<h1 style='color:orange;text-align:center'>Good Morning</h1>");
			
		else if(hour<16)
			pw.println("<h1 style='color:red;text-align:center'>Good Afternoon</h1>");
		else if (hour<20)
			pw.println("<h1 style='color:green;text-align:center'>Good Evening</h1>");
		else
			pw.println("<h1 style='color:blue;text-align:center'>Good Night</h1>");
		   //add home hyperlink
		pw.println("<br><a href='http://localhost:2020/WishApp/page.html'>home</a>");
	
	       //close stream
		pw.close();
	}

}
