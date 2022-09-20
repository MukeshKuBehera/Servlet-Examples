package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
@SuppressWarnings("serial")
public class DateServlet extends GenericServlet{
	
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
		
		//get PrintWriter Obj from Response  Obj
		PrintWriter pw=res.getWriter();
		
		Date date=new Date();
		
		//write generated output by using PrintWriter Stream
		res.setContentType("text/html");
		
		pw.println("<h1>Date and Time is::"+date+"</h1>");
		
		
		//find out hashCode 
		
		pw.println("<br><b>current thread class hascode :"+this.hashCode()+"obj<b>");
		pw.println("<br><b>Request Object HashCode::"+req.hashCode()+"<b>");
		pw.println("<br><b>Response Object HashCode::"+res.hashCode()+"<b>");
		pw.println("<br><b>Currnet Thread HashCode::"+Thread.currentThread().hashCode()+"<br>currnet Thread Name::"+Thread.currentThread().getName()+"</b>");
		//close the stream objects
		pw.close();
	}

}
