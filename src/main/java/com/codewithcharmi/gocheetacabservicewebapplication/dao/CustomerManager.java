package com.codewithcharmi.gocheetacabservicewebapplication.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.codewithcharmi.gocheetacabservicewebapplication.model.Admin;
import com.codewithcharmi.gocheetacabservicewebapplication.model.Customer;

public class CustomerManager {
	
	public static Customer getSpecificCustomerByCustomerId (int customerId) throws ClassNotFoundException, SQLException {
		
		//Establish the connection
		DatabaseConnector connector = new DatabaseConnectorImplMySQL();
		Connection connection = connector.getConnection();
		
		
		// 4 --> Prepare the statement 
		
		String query = "SELECT * FROM customer WHERE customerId = ? ";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, customerId);
		
		// 5 --> Execute the query 
		ResultSet rs = ps.executeQuery();
		 
		
		// 6 --> Evaluate the response/result set
		Customer customer = new Customer();
		
		if (rs.next()) {
			
			customer.setCustomerId(rs.getInt("customerId"));
			customer.setCustomerFname(rs.getString("customerFname"));
			customer.setCustomerLname(rs.getString("customerLname"));
			customer.setCustomerMobile(rs.getString("customerMobile"));
			customer.setCustomerEmail(rs.getString("customerEmail"));
			customer.setCustomerUname(rs.getString("customerUname"));
			customer.setCustomerPwd(rs.getString("customerEmail"));
			
			
		}
		
		// 7 --> Close the statement and the connection
		
		ps.close();
		connection.close();
		return customer; 
		
	}
	
	
	public static List<Customer> getAllCustomers() throws ClassNotFoundException, SQLException {
		
		DatabaseConnector connector = new DatabaseConnectorImplMySQL();
		Connection connection = connector.getConnection();
		
		String query  = "SELECT * FROM customer";
		Statement st = connection.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
		List<Customer> customers = new ArrayList();
		
		while(rs.next()) {
			
			Customer customer = new Customer(rs.getInt("customerId"),rs.getString("customerFname"),
					rs.getString("customerLname"),rs.getString("customerMobile"),
					rs.getString("customerEmail"),rs.getString("customerUname"),rs.getString("customerPwd"));
			customers.add(customer);
			
		}
		
		st.close();
		connection.close();
		return customers; 
		
	}
	
	
	public static boolean addCustomer(Customer customerFname) throws ClassNotFoundException, SQLException {
		
		DatabaseConnector connector = new DatabaseConnectorImplMySQL();
		Connection connection = connector.getConnection();
		
		String query  = "INSERT INTO customer (customerFname,customerLname,customerMobile,customerEmail,customerUname,customerPwd) VALUES(?, ?, ?, ?,?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		
		Customer customer  = new Customer();
		
		ps.setString(1, customer.getCustomerFname());
		ps.setString(2, customer.getCustomerLname());
		ps.setString(3, customer.getCustomerMobile());
		ps.setString(4, customer.getCustomerEmail());
		ps.setString(1, customer.getCustomerUname());
		ps.setString(1, customer.getCustomerPwd());
		
		
		boolean result  = ps.executeUpdate() > 0;
		ps.close();
		connection.close();
		
		return result;
		
	}
	
	
	public static boolean updateCustomer(Customer customerFname) throws ClassNotFoundException, SQLException {
		
		DatabaseConnector connector = new DatabaseConnectorImplMySQL();
		Connection connection = connector.getConnection();
		
		String query  = "UPDATE customer SET(customerFname = ?, customerLname = ?, customerMobile = ?, customerEmail = ?, customerUname = ?, customerPwd = ? ) WHERE customerId = ? ";
		PreparedStatement ps = connection.prepareStatement(query);
		
		Customer customer  = new Customer();
		
		ps.setString(1, customer.getCustomerFname());
		ps.setString(2, customer.getCustomerLname());
		ps.setString(3, customer.getCustomerMobile());
		ps.setString(4, customer.getCustomerEmail());
		ps.setString(1, customer.getCustomerUname());
		ps.setString(1, customer.getCustomerPwd());
		
		boolean result  = ps.executeUpdate() > 0;
		ps.close();
		connection.close();
		
		
		return result;
		
	}
	
	
	public static boolean deleteCustomer(int customerId) throws ClassNotFoundException, SQLException {
		
		DatabaseConnector connector = new DatabaseConnectorImplMySQL();
		Connection connection = connector.getConnection();
		
		String query  = "DELETE customer WHERE customerId = ? ";
		PreparedStatement ps = connection.prepareStatement(query);
		
		ps.setInt(1, customerId);
		
		boolean result  = ps.executeUpdate() > 0;
		ps.close();
		connection.close();
		
		
		return result;
		
	}


	public static boolean deleteCustomer(Customer customerId) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
