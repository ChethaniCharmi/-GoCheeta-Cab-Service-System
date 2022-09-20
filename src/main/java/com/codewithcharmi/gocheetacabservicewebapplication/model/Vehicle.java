package com.codewithcharmi.gocheetacabservicewebapplication.model;

public class Vehicle {
	private int vehicleId;
	private String vehicleName;
	private String vehicleCategory;
	private int driverId;
	
	
	public Vehicle() {
		
		
	}


	public Vehicle(String vehicleName, String vehicleCategory, int driverId) {
		super();
		this.vehicleName = vehicleName;
		this.vehicleCategory = vehicleCategory;
		this.driverId = driverId;
	}


	public Vehicle(int vehicleId, String vehicleName, String vehicleCategory, int driverId) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.vehicleCategory = vehicleCategory;
		this.driverId = driverId;
	}


	public int getVehicleId() {
		return vehicleId;
	}


	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}


	public String getVehicleName() {
		return vehicleName;
	}


	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}


	public String getVehicleCategory() {
		return vehicleCategory;
	}


	public void setVehicleCategory(String vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
	}


	public int getDriverId() {
		return driverId;
	}


	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	
	
	
	
	
	

}
