package com.codewithcharmi.gocheetacabservicewebapplication.service;

import java.sql.SQLException;
import java.util.List;

import com.codewithcharmi.gocheetacabservicewebapplication.dao.AdminManager;
import com.codewithcharmi.gocheetacabservicewebapplication.model.Admin;

public class AdminService {
	
	public Admin getSpecificAdminByAdminId (int adminId) throws ClassNotFoundException, SQLException {
		
		return AdminManager.getSpecificAdminByAdminId(adminId);
		
	}
	
	public List<Admin> getAllAdmins() throws ClassNotFoundException, SQLException {
		
		return AdminManager.getAllAdmins();
		
	}
	
	
	public boolean addAdmin(Admin adminFname) throws ClassNotFoundException, SQLException {
		
		return AdminManager.addAdmin(adminFname);
		
	}
	
	
	public boolean updateAdmin(Admin adminFname) throws ClassNotFoundException, SQLException {
		
		return AdminManager.updateAdmin(adminFname);
		
	}
	
	
	public boolean deleteAdmin(Admin adminId) {
		
		return AdminManager.deleteAdmin(adminId); 
		
	}
	
	

}
