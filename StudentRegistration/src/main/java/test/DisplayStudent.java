package test;

import java.io.*;
import javax.servlet.*;


@SuppressWarnings("serial")
public class DisplayStudent extends GenericServlet {
	
	
    @Override
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
		
		String UName=req.getParameter("name");
		ServletContext sct=this.getServletContext();
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("Welcome user:"+UName);
		pw.println("<br>=========ServletContext==========");
		pw.println("<br>server Infomation"+sct.getServerInfo());
	}

}
