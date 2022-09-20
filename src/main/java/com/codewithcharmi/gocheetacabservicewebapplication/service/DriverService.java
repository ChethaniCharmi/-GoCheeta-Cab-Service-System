package com.codewithcharmi.gocheetacabservicewebapplication.service;

import java.sql.SQLException;
import java.util.List;

import com.codewithcharmi.gocheetacabservicewebapplication.dao.DriverManager;
import com.codewithcharmi.gocheetacabservicewebapplication.model.Driver;

public class DriverService {
	
	public Driver getSpecificDriverByDriverId (int driverId) throws ClassNotFoundException, SQLException {
		
		return DriverManager.getSpecificDriverByDriverId(driverId);
		
	}
	
	
	public List<Driver> getAllDrivers() throws ClassNotFoundException, SQLException {
		
		return DriverManager.getAllDrivers();
		
	}
	
	
	public boolean addDriver(Driver driverFname) throws ClassNotFoundException, SQLException {
		
		return DriverManager.addDriver(driverFname);
		
	}
	
	
	public boolean updateDriver(Driver driverFname) throws ClassNotFoundException, SQLException {
		
		return DriverManager.updateDriver(driverFname);
		
	}
	
	
	public boolean deleteDriver(Driver driverId) {
		
		return DriverManager.deleteDriver(driverId);
	}
	

}
