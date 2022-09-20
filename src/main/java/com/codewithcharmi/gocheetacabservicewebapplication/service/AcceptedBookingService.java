package com.codewithcharmi.gocheetacabservicewebapplication.service;

import java.sql.SQLException;
import java.util.List;

import com.codewithcharmi.gocheetacabservicewebapplication.dao.AcceptedBookingManager;
import com.codewithcharmi.gocheetacabservicewebapplication.model.AcceptedBooking;

public class AcceptedBookingService {
	
	public AcceptedBooking getSpecificAcceptedBookingByaccBookingId (int accBookingId) throws ClassNotFoundException, SQLException {
		
		return AcceptedBookingManager.getSpecificAcceptedBookingByaccBookingId(accBookingId);
		
	}
	
	
	public List<AcceptedBooking> getAllAcceptedBookings() throws ClassNotFoundException, SQLException {
		
		return AcceptedBookingManager.getAllAcceptedBookings();
		
	}
	
	
	public boolean addAcceptedBooking(AcceptedBooking accBookingId) throws ClassNotFoundException, SQLException {
		
		return AcceptedBookingManager.addAcceptedBooking(accBookingId);
		
	}
	
	
	public boolean updateAcceptedBooking(AcceptedBooking accBookingId) throws ClassNotFoundException, SQLException {
		
		return AcceptedBookingManager.updateAcceptedBooking(accBookingId);
		
	}
	
	
	public boolean deleteAccepetedBooking(AcceptedBooking accBookingId) throws ClassNotFoundException, SQLException {
		
		return AcceptedBookingManager.deleteAccepetedBooking(accBookingId);
		
	}
	
	

}
