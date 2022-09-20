package com.codewithcharmi.gocheetacabservicewebapplication.service;

import java.util.List;

import com.codewithcharmi.gocheetacabservicewebapplication.dao.VehicleManager;
import com.codewithcharmi.gocheetacabservicewebapplication.model.Vehicle;

public class VehicleService {
	
	public Vehicle getSpecificVehicleByVehicleId (int vehicleId) {
		
		return VehicleManager.getSpecificVehicleByVehicleId(vehicleId);
		
	}
	
	
	public List<Vehicle> getAllVehicles() {
		
		return VehicleManager.getAllVehicles();
		
	}
	
	
	public boolean addVehicle(Vehicle vehicleName) {
		
		return VehicleManager.addVehicle(vehicleName);
		
	}
	
	
	public boolean updateVehicle(Vehicle vehicleName) {
		
		return VehicleManager.updateVehicle(vehicleName);
		
	}
	
	
	public boolean deleteVehicle(Vehicle vehicleId) {
		
		return VehicleManager.deleteVehicle(vehicleId);
		
	}
	

}
