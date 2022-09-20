package com.codewithcharmi.gocheetacabservicewebapplication.model;

public class Driver {
	
	private int driverId;
	private String driverFname;
	private String driverLname;
	private String driverMobile;
	private String driverEmail;
	private String driverUname;
	private String driverPwd;
	
	
	public Driver() {
		
		
	}


	public Driver(String driverFname, String driverLname, String driverMobile, String driverEmail, String driverUname,
			String driverPwd) {
		super();
		this.driverFname = driverFname;
		this.driverLname = driverLname;
		this.driverMobile = driverMobile;
		this.driverEmail = driverEmail;
		this.driverUname = driverUname;
		this.driverPwd = driverPwd;
	}


	public Driver(int driverId, String driverFname, String driverLname, String driverMobile, String driverEmail,
			String driverUname, String driverPwd) {
		super();
		this.driverId = driverId;
		this.driverFname = driverFname;
		this.driverLname = driverLname;
		this.driverMobile = driverMobile;
		this.driverEmail = driverEmail;
		this.driverUname = driverUname;
		this.driverPwd = driverPwd;
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


	public String getDriverLname() {
		return driverLname;
	}


	public void setDriverLname(String driverLname) {
		this.driverLname = driverLname;
	}


	public String getDriverMobile() {
		return driverMobile;
	}


	public void setDriverMobile(String driverMobile) {
		this.driverMobile = driverMobile;
	}


	public String getDriverEmail() {
		return driverEmail;
	}


	public void setDriverEmail(String driverEmail) {
		this.driverEmail = driverEmail;
	}


	public String getDriverUname() {
		return driverUname;
	}


	public void setDriverUname(String driverUname) {
		this.driverUname = driverUname;
	}


	public String getDriverPwd() {
		return driverPwd;
	}


	public void setDriverPwd(String driverPwd) {
		this.driverPwd = driverPwd;
	}
	
	
	
	

}
