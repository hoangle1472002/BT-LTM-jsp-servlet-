package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.bean.User;

public class UserDao {
	public Connection conn;
	public void Connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
    	conn = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/cnweb1", "root", "hoangle14702@");
	}
	public User GetUserLogin(String username,String password) throws ClassNotFoundException {
		try {
			Connect();
			String sql = "select * from user where username = ? and password = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, username);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("username");
				String pass = rs.getString("password");
				User user = new User(id,name,pass);
				return user;
			}
			
		}
		catch(Exception e) {}
		return null;
	}
	
	public void InsertUser(User user) throws ClassNotFoundException {
		String sql = "INSERT INTO user (username, password) VALUES (?, ?)";
        // try-with-resource statement will auto close the connection.
		try {
			Connect();  
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, user.getUsername());
			stmt.setString(2, user.getPassword());
            int insertRow = stmt.executeUpdate();
        } catch (SQLException e) {
         
        }
    }
}
