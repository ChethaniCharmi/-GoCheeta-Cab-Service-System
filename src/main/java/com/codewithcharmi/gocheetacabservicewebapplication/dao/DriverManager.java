package com.codewithcharmi.gocheetacabservicewebapplication.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.codewithcharmi.gocheetacabservicewebapplication.model.Customer;
import com.codewithcharmi.gocheetacabservicewebapplication.model.Driver;

public class DriverManager {
	
	public static Driver getSpecificDriverByDriverId (int driverId) throws ClassNotFoundException, SQLException {
		

		//Establish the connection
		DatabaseConnector connector = new DatabaseConnectorImplMySQL();
		Connection connection = connector.getConnection();
		
		
		// 4 --> Prepare the statement 
		
		String query = "SELECT * FROM driver WHERE driverId = ? ";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, driverId);
		
		// 5 --> Execute the query 
		ResultSet rs = ps.executeQuery();
		 
		
		// 6 --> Evaluate the response/result set
		Driver driver = new Driver();
		
		if (rs.next()) {
			
			driver.setDriverId(rs.getInt("driverId"));
			driver.setDriverFname(rs.getString("driverFname"));
			driver.setDriverLname(rs.getString("driverLname"));
			driver.setDriverMobile(rs.getString("driverMobile"));
			driver.setDriverEmail(rs.getString("driverEmail"));
			driver.setDriverUname(rs.getString("driverUname"));
			driver.setDriverPwd(rs.getString("driverEmail"));
		}
		
		// 7 --> Close the statement and the connection
		
				ps.close();
				connection.close();
				return driver; 
		
	}
	
	
	public static List<Driver> getAllDrivers() throws ClassNotFoundException, SQLException {
		
		DatabaseConnector connector = new DatabaseConnectorImplMySQL();
		Connection connection = connector.getConnection();
		
		String query  = "SELECT * FROM driver";
		Statement st = connection.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
		List<Driver> drivers = new ArrayList();
		
		while(rs.next()) {
			
			Driver driver = new Driver(rs.getInt("driverId"),rs.getString("driverFname"),
					rs.getString("driverLname"),rs.getString("driverMobile"),
					rs.getString("driverEmail"),rs.getString("driverUname"),rs.getString("driverPwd"));
			drivers.add(driver);
			
		}
		
		st.close();
		connection.close();
		return drivers; 
		
	}
	
	
	public static boolean addDriver(Driver driverFname) throws ClassNotFoundException, SQLException {
		
		DatabaseConnector connector = new DatabaseConnectorImplMySQL();
		Connection connection = connector.getConnection();
		
		String query  = "INSERT INTO driver (driverFname,driverLname,driverMobile,driverEmail,driverUname,driverPwd) VALUES(?, ?, ?, ?,?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		
		Driver driver  = new Driver();
		
		ps.setString(1, driver.getDriverFname());
		ps.setString(2, driver.getDriverLname());
		ps.setString(3, driver.getDriverMobile());
		ps.setString(4, driver.getDriverEmail());
		ps.setString(1, driver.getDriverUname());
		ps.setString(1, driver.getDriverPwd());
		
		
		boolean result  = ps.executeUpdate() > 0;
		ps.close();
		connection.close();
		
		return result;
		
	}
	
	
	public static boolean updateDriver(Driver driverFname) throws ClassNotFoundException, SQLException {
		
		DatabaseConnector connector = new DatabaseConnectorImplMySQL();
		Connection connection = connector.getConnection();
		
		String query  = "UPDATE driver SET(driverFname = ?, driverLname = ?, driverMobile = ?, driverEmail = ?, driverUname = ?, driverPwd = ? ) WHERE driverId = ? ";
		PreparedStatement ps = connection.prepareStatement(query);
		
		Driver driver  = new Driver();
		
		ps.setString(1, driver.getDriverFname());
		ps.setString(2, driver.getDriverLname());
		ps.setString(3, driver.getDriverMobile());
		ps.setString(4, driver.getDriverEmail());
		ps.setString(1, driver.getDriverUname());
		ps.setString(1, driver.getDriverPwd());
		
		boolean result  = ps.executeUpdate() > 0;
		ps.close();
		connection.close();
		
		
		return result;
		
	}
	
	
	public static boolean deleteDriver(int driverId) throws ClassNotFoundException, SQLException {
		
		DatabaseConnector connector = new DatabaseConnectorImplMySQL();
		Connection connection = connector.getConnection();
		
		String query  = "DELETE driver WHERE driverId = ? ";
		PreparedStatement ps = connection.prepareStatement(query);
		
		ps.setInt(1, driverId);
		
		boolean result  = ps.executeUpdate() > 0;
		ps.close();
		connection.close();
		
		
		return result;
		
	}


	public static boolean deleteDriver(Driver driverId) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
