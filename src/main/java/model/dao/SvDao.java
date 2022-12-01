package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.bean.SV;
import model.bean.SV_Faculty;
import model.bean.User;

public class SvDao {
	public Connection conn;
	public void Connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
    	conn = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/cnweb1", "root", "hoangle14702@");
	}
	
	public SV GetSVById(int id) {
		try {
			Connect();
			String sql="SELECT * FROM sv where id = " +id;
			Statement stmt = conn.createStatement();	
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String mssv = rs.getString("mssv");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				int  id_faculty = rs.getInt("id_sv_faculty");
				SV sv = new SV(id,mssv,id_faculty,name,gender);
				return sv;
			}
			
		}catch(Exception e) {
			
		}
		return null;
	}
	
	public List<SV_Faculty> GetAllSVByNameFaculty(String textName){
		List<SV_Faculty> data = new ArrayList<>();
		try {
			Connect();
			String sql="SELECT * FROM sv inner join faculty on sv.id_sv_faculty = faculty.id where faculty.nameFaculty like '%" + textName+  "%' ;";
			Statement stmt = conn.createStatement();	
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String mssv = rs.getString("mssv");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				String faculty = rs.getString("nameFaculty");
				SV_Faculty sv_f = new SV_Faculty(id,mssv,name,gender,faculty);
				data.add(sv_f);
			}
			
		}catch(Exception e) {
			
		}
		
		return data;
	}
	
	   public boolean DeleteSv(int id){
	        String sql = "DELETE FROM sv where id = ?";
	        try {
	        	 Connect();
	 	        PreparedStatement statement = conn.prepareStatement(sql);
	 	        statement.setInt(1,id);
	 	        boolean rowDeleted = statement.executeUpdate() > 0;
	 	        statement.close();;
	 	        return rowDeleted;    
	        }catch(Exception e) {}
	        return false;
	    }
	   
	   public boolean UpdateSv(SV sv){
		   String sql = "update sv set name = ?,gender= ?, id_sv_faculty =?, mssv = ? where mssv = ?";
	        try {
	        	 Connect();
	 	        PreparedStatement statement = conn.prepareStatement(sql);
	 	        statement.setString(1,sv.getName() );
	 	        statement.setString(2,sv.getGender() );
	 	        statement.setInt(3,sv.getIdSvFaculty() );
	 	        statement.setString(4,sv.getMssv());
	 	        statement.setString(5,sv.getMssv());
	 	        boolean rowUpdated = statement.executeUpdate() > 0;
	 	        statement.close();;
	 	        return rowUpdated;    
	        }catch(Exception e) {}
	        return false;
	    }
	   
	   public void InsertSV(SV sv) throws ClassNotFoundException {
			String sql = "INSERT INTO sv (mssv,name,gender,id_sv_faculty) VALUES (?,?,?,?)";
	        // try-with-resource statement will auto close the connection.
			try {
				Connect();  
				PreparedStatement stmt = conn.prepareStatement(sql);
				stmt.setString(1, sv.getMssv());
				stmt.setString(2, sv.getName());
				stmt.setString(3, sv.getGender());
				stmt.setInt(4, sv.getIdSvFaculty());
	            int insertRow = stmt.executeUpdate();
	        } catch (SQLException e) {
	         
	        }
	    }
	   
	   
	   
}
