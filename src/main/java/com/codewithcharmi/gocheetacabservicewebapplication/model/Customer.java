package com.codewithcharmi.gocheetacabservicewebapplication.model;

public class Customer {
	
	private int customerId;
	private String customerFname;
	private String customerLname;
	private String customerMobile;
	private String customerEmail;
	private String customerUname;
	private String customerPwd;
	
	
	public Customer() {
		
		
	}


	public Customer(String customerFname, String customerLname, String customerMobile, String customerEmail,
			String customerUname, String customerPwd) {
		super();
		this.customerFname = customerFname;
		this.customerLname = customerLname;
		this.customerMobile = customerMobile;
		this.customerEmail = customerEmail;
		this.customerUname = customerUname;
		this.customerPwd = customerPwd;
	}


	public Customer(int customerId, String customerFname, String customerLname, String customerMobile,
			String customerEmail, String customerUname, String customerPwd) {
		super();
		this.customerId = customerId;
		this.customerFname = customerFname;
		this.customerLname = customerLname;
		this.customerMobile = customerMobile;
		this.customerEmail = customerEmail;
		this.customerUname = customerUname;
		this.customerPwd = customerPwd;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerFname() {
		return customerFname;
	}


	public void setCustomerFname(String customerFname) {
		this.customerFname = customerFname;
	}


	public String getCustomerLname() {
		return customerLname;
	}


	public void setCustomerLname(String customerLname) {
		this.customerLname = customerLname;
	}


	public String getCustomerMobile() {
		return customerMobile;
	}


	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}


	public String getCustomerEmail() {
		return customerEmail;
	}


	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}


	public String getCustomerUname() {
		return customerUname;
	}


	public void setCustomerUname(String customerUname) {
		this.customerUname = customerUname;
	}


	public String getCustomerPwd() {
		return customerPwd;
	}


	public void setCustomerPwd(String customerPwd) {
		this.customerPwd = customerPwd;
	}
	
	
	
	
	

}
