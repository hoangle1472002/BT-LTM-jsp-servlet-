package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectDB {
	public Connection conn;
	public Connection getConnection() throws ClassNotFoundException {
			 try {
		    		Class.forName("com.mysql.jdbc.Driver");
		        	conn = DriverManager
		    	            .getConnection("jdbc:mysql://localhost:3306/cnweb1", "root", "hoangle14702@");

		        } catch (SQLException e) {
		           
		        }
			 return conn;
	}
}
