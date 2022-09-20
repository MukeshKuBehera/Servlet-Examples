package test;

import java.sql.*;
import javax.servlet.*;
public class InsertDao {
	public class insert {

	}

	public int k=0;
	
	public int insert(ServletRequest req) {
		
		try {
			Connection con=DBConnection.getCon(req);
			
			PreparedStatement ps=con.prepareStatement("insert into UserReg values(?,?,?,?,?,?,?)");
			
			ps.setString(1,req.getParameter("uname"));
			ps.setString(2,req.getParameter("pword"));
			ps.setString(3,req.getParameter("fname"));
			ps.setString(4,req.getParameter("lname"));
			ps.setString(5,req.getParameter("mid"));
			ps.setString(6,req.getParameter("addrs"));
			ps.setLong(7,Long.parseLong(req.getParameter("phone")));
			
			k=ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return k;
		
	}

}
