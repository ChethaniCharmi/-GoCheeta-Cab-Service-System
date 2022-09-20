package com.codewithcharmi.gocheetacabservicewebapplication.dao;


// 1 --> Import the packages
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.accessibility.AccessibleRelationSet;

import com.codewithcharmi.gocheetacabservicewebapplication.model.AcceptedBooking;

public class AcceptedBookingManager {
	
	
	public static AcceptedBooking getSpecificAcceptedBookingByaccBookingId (int accBookingId) throws ClassNotFoundException, SQLException {
		
		//Establish the connection
		DatabaseConnector connector = new DatabaseConnectorImplMySQL();
		Connection connection = connector.getConnection();
		
		
		// 4 --> Prepare the statement 
		
		String query = "SELECT * FROM acceptedbooking WHERE accBookingId = ? ";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, accBookingId);
		
		// 5 --> Execute the query 
		ResultSet rs = ps.executeQuery();
		 
		
		// 6 --> Evaluate the response/result set
		AcceptedBooking acceptedbooking = new AcceptedBooking();
		
		if (rs.next()) {
			
			acceptedbooking.setAccBookingId(rs.getInt("accBookingId"));
			acceptedbooking.setCustomerId(rs.getInt("customerId"));
			acceptedbooking.setDriverId(rs.getInt("driverId"));
			acceptedbooking.setDriverFname(rs.getString("driverFname"));
			acceptedbooking.setStatus(rs.getString("status"));
			
			
		}
		
		// 7 --> Close the statement and the connection
		
		ps.close();
		connection.close();
		return acceptedbooking;
	}
	
	
	
	public static List<AcceptedBooking> getAllAcceptedBookings() throws ClassNotFoundException, SQLException {
		
		DatabaseConnector connector = new DatabaseConnectorImplMySQL();
		Connection connection = connector.getConnection();
		
		String query  = "SELECT * FROM acceptbooking";
		Statement st = connection.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
		List<AcceptedBooking> acceptedbookings = new ArrayList();
		
		while(rs.next()) {
			
			AcceptedBooking acceptedbooking = new AcceptedBooking(rs.getInt("accBookingId"),rs.getInt("customerId"),rs.getInt("driverId"),rs.getString("driverFname"),rs.getString("status"));
			acceptedbookings.add(acceptedbooking);
			
		}
		
		st.close();
		connection.close();
		return acceptedbookings;
		
		
	}
	
	
	public static boolean addAcceptedBooking(AcceptedBooking accBookingId) throws ClassNotFoundException, SQLException {
		
		DatabaseConnector connector = new DatabaseConnectorImplMySQL();
		Connection connection = connector.getConnection();
		
		String query  = "INSERT INTO acceptbooking (customerId,driverId,driverFname,status) VALUES(?, ?, ?, ?)";
		PreparedStatement ps = connection.prepareStatement(query);
		
		AcceptedBooking acceptedbooking  = new AcceptedBooking();
		
		ps.setInt(1, acceptedbooking.getCustomerId());
		ps.setInt(2, acceptedbooking.getDriverId());
		ps.setString(3, acceptedbooking.getDriverFname());
		ps.setString(4, acceptedbooking.getStatus());
		
		boolean result  = ps.executeUpdate() > 0;
		ps.close();
		connection.close();
		
		
		return result;
		
	}
	
	
	public static boolean updateAcceptedBooking(AcceptedBooking accBookingId) throws ClassNotFoundException, SQLException {
		
		DatabaseConnector connector = new DatabaseConnectorImplMySQL();
		Connection connection = connector.getConnection();
		
		String query  = "UPDATE acceptbooking SET(customerId = ?, driverId = ?, driverFname = ?, status = ?) WHERE accBookingId = ? ";
		PreparedStatement ps = connection.prepareStatement(query);
		
		AcceptedBooking acceptedbooking  = new AcceptedBooking();
		
		ps.setInt(1, acceptedbooking.getCustomerId());
		ps.setInt(2, acceptedbooking.getDriverId());
		ps.setString(3, acceptedbooking.getDriverFname());
		ps.setString(4, acceptedbooking.getStatus());
		
		boolean result  = ps.executeUpdate() > 0;
		ps.close();
		connection.close();
		
		
		return result;
		
		
	}
	
	
	public static boolean deleteAccepetedBooking(int accBookingId) throws ClassNotFoundException, SQLException {
		
		DatabaseConnector connector = new DatabaseConnectorImplMySQL();
		Connection connection = connector.getConnection();
		
		String query  = "DELETE acceptbooking WHERE accBookingId = ? ";
		PreparedStatement ps = connection.prepareStatement(query);
		
		ps.setInt(1, accBookingId);
		
		boolean result  = ps.executeUpdate() > 0;
		ps.close();
		connection.close();
		
		
		return result;
		
	}


	public static boolean deleteAccepetedBooking(AcceptedBooking accBookingId) {
		// TODO Auto-generated method stub
		return false;
	}

}
