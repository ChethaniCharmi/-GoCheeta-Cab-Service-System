package com.codewithcharmi.gocheetacabservicewebapplication.service;

import java.sql.SQLException;
import java.util.List;

import com.codewithcharmi.gocheetacabservicewebapplication.dao.CustomerManager;
import com.codewithcharmi.gocheetacabservicewebapplication.model.Customer;

public class CustomerService {
	
	public Customer getSpecificCustomerByCustomerId (int customerId) throws ClassNotFoundException, SQLException {
		
		return CustomerManager.getSpecificCustomerByCustomerId(customerId);
		
	}
	
	
	public List<Customer> getAllCustomers() throws ClassNotFoundException, SQLException {
		
		return CustomerManager.getAllCustomers();
		
	}
	
	
	public boolean addCustomer(Customer customerFname) throws ClassNotFoundException, SQLException {
		
		return CustomerManager.addCustomer(customerFname);
		
	}
	
	
	public boolean updateCustomer(Customer customerFname) throws ClassNotFoundException, SQLException {
		
		return CustomerManager.updateCustomer(customerFname);
		
	}
	
	
	public boolean deleteCustomer(Customer customerId) {
		
		return CustomerManager.deleteCustomer(customerId);
		
	}
	

}
