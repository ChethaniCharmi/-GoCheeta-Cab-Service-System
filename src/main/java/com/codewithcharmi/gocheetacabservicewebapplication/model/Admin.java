package com.codewithcharmi.gocheetacabservicewebapplication.model;

public class Admin {
	
	private int adminId;
	private String adminFname;
	private String adminLname;
	private String adminUname;
	private String adminPwd;
	
	
	public Admin() {
		
		
	}


	public Admin(String adminFname, String adminLname, String adminUname, String adminPwd) {
		super();
		this.adminFname = adminFname;
		this.adminLname = adminLname;
		this.adminUname = adminUname;
		this.adminPwd = adminPwd;
	}


	public Admin(int adminId, String adminFname, String adminLname, String adminUname, String adminPwd) {
		super();
		this.adminId = adminId;
		this.adminFname = adminFname;
		this.adminLname = adminLname;
		this.adminUname = adminUname;
		this.adminPwd = adminPwd;
	}


	public int getAdminId() {
		return adminId;
	}


	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}


	public String getAdminFname() {
		return adminFname;
	}


	public void setAdminFname(String adminFname) {
		this.adminFname = adminFname;
	}


	public String getAdminLname() {
		return adminLname;
	}


	public void setAdminLname(String adminLname) {
		this.adminLname = adminLname;
	}


	public String getAdminUname() {
		return adminUname;
	}


	public void setAdminUname(String adminUname) {
		this.adminUname = adminUname;
	}


	public String getAdminPwd() {
		return adminPwd;
	}


	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}
	
	
	
	
	

}
