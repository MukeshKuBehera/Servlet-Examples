package test;

import java.sql.*;

import javax.servlet.ServletRequest;

public class DBConnection {
	private static Connection con=null;
	private DBConnection() {}
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public Connection getCon(ServletRequest req) {
		return con;
	}
 
	
	}


