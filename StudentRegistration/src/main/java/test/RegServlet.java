package test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

import test.InsertDao.insert;

@SuppressWarnings("serial")
@WebServlet("/dis")
public class RegServlet extends GenericServlet{
	
	
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
		
	 int k=new InsertDao.insert(req);
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		if(k>0) {
			pw.println("User resistered successfully...<br>");
			
			RequestDispatcher rd=req.getRequestDispatcher("input.html");
			rd.include(req, res);
		}
	}

}
