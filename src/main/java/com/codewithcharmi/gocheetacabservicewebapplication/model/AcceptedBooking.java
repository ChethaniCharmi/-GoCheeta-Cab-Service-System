package com.codewithcharmi.gocheetacabservicewebapplication.model;

public class AcceptedBooking {
	
	private int accBookingId;
	private int customerId;
	private int driverId;
	private String driverFname;
	private String status;
	
	public AcceptedBooking() {
		
		
	}
	

	public AcceptedBooking(int customerId, int driverId, String driverFname, String status) {
		super();
		this.customerId = customerId;
		this.driverId = driverId;
		this.driverFname = driverFname;
		this.status = status;
	}

	
	public AcceptedBooking(int accBookingId, int customerId, int driverId, String driverFname, String status) {
		super();
		this.accBookingId = accBookingId;
		this.customerId = customerId;
		this.driverId = driverId;
		this.driverFname = driverFname;
		this.status = status;
	}


	public int getAccBookingId() {
		return accBookingId;
	}


	public void setAccBookingId(int accBookingId) {
		this.accBookingId = accBookingId;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public int getDriverId() {
		return driverId;
	}


	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}


	public String getDriverFname() {
		return driverFname;
	}


	public void setDriverFname(String driverFname) {
		this.driverFname = driverFname;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	
	
	

}
