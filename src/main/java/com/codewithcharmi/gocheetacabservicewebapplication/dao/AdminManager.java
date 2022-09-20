package com.codewithcharmi.gocheetacabservicewebapplication.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.codewithcharmi.gocheetacabservicewebapplication.model.AcceptedBooking;
import com.codewithcharmi.gocheetacabservicewebapplication.model.Admin;

public class AdminManager {
	
	public static Admin getSpecificAdminByAdminId (int adminId) throws ClassNotFoundException, SQLException {
		//Establish the connection
				DatabaseConnector connector = new DatabaseConnectorImplMySQL();
				Connection connection = connector.getConnection();
				
				
				// 4 --> Prepare the statement 
				
				String query = "SELECT * FROM admin WHERE adminId = ? ";
				PreparedStatement ps = connection.prepareStatement(query);
				ps.setInt(1, adminId);
				
				// 5 --> Execute the query 
				ResultSet rs = ps.executeQuery();
				 
				
				// 6 --> Evaluate the response/result set
				Admin admin = new Admin();
				
				if (rs.next()) {
					
					admin.setAdminId(rs.getInt("adminId"));
					admin.setAdminFname(rs.getString("adminFname"));
					admin.setAdminLname(rs.getString("adminLname"));
					admin.setAdminUname(rs.getString("adminUname"));
					admin.setAdminPwd(rs.getString("adminPwd"));
					
					
				}
				
				// 7 --> Close the statement and the connection
				
				ps.close();
				connection.close();
				return admin;
	}
	
	
	public static List<Admin> getAllAdmins() throws ClassNotFoundException, SQLException {
		
		DatabaseConnector connector = new DatabaseConnectorImplMySQL();
		Connection connection = connector.getConnection();
		
		String query  = "SELECT * FROM admin";
		Statement st = connection.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
		List<Admin> admins = new ArrayList();
		
		while(rs.next()) {
			
			Admin admin = new Admin(rs.getInt("adminId"),rs.getString("adminFname"),rs.getString("adminLname"),rs.getString("adminUname"),rs.getString("adminPwd"));
			admins.add(admin);
			
		}
		
		st.close();
		connection.close();
		return admins;
	}
	
	
	public static boolean addAdmin(Admin adminFname) throws ClassNotFoundException, SQLException {
		
		DatabaseConnector connector = new DatabaseConnectorImplMySQL();
		Connection connection = connector.getConnection();
		
		String query  = "INSERT INTO admin (adminFname,adminLname,adminUname,adminPwd) VALUES(?, ?, ?, ?)";
		PreparedStatement ps = connection.prepareStatement(query);
		
		Admin admin  = new Admin();
		
		ps.setString(1, admin.getAdminFname());
		ps.setString(2, admin.getAdminLname());
		ps.setString(3, admin.getAdminUname());
		ps.setString(4, admin.getAdminPwd());
		
		
		boolean result  = ps.executeUpdate() > 0;
		ps.close();
		connection.close();
		
		return result;
		
		
	}
	
	
	public static boolean updateAdmin(Admin adminFname) throws ClassNotFoundException, SQLException {
		
		DatabaseConnector connector = new DatabaseConnectorImplMySQL();
		Connection connection = connector.getConnection();
		
		String query  = "UPDATE admin SET(adminFname = ?, adminLname = ?, adminUname = ?, status = ?) WHERE adminId = ? ";
		PreparedStatement ps = connection.prepareStatement(query);
		
		Admin admin  = new Admin();
		
		ps.setString(1, admin.getAdminFname());
		ps.setString(2, admin.getAdminLname());
		ps.setString(3, admin.getAdminUname());
		ps.setString(4, admin.getAdminPwd());
		
		boolean result  = ps.executeUpdate() > 0;
		ps.close();
		connection.close();
		
		
		return result;
		
	}
	
	
	public static boolean deleteAdmin(int adminId) throws ClassNotFoundException, SQLException {
		
		DatabaseConnector connector = new DatabaseConnectorImplMySQL();
		Connection connection = connector.getConnection();
		
		String query  = "DELETE admin WHERE adminId = ? ";
		PreparedStatement ps = connection.prepareStatement(query);
		
		ps.setInt(1, adminId);
		
		boolean result  = ps.executeUpdate() > 0;
		ps.close();
		connection.close();
		
		
		return result;
		
	}


	public static boolean deleteAdmin(Admin adminId) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
