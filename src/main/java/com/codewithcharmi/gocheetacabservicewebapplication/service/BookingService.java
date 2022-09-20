package com.codewithcharmi.gocheetacabservicewebapplication.service;

import java.util.List;

import com.codewithcharmi.gocheetacabservicewebapplication.dao.BookingManager;
import com.codewithcharmi.gocheetacabservicewebapplication.model.Booking;

public class BookingService {
	
	public Booking getSpecificBookingByBookingId (int bookingId) {
		
		return BookingManager.getSpecificBookingByBookingId(bookingId);
		
	}
	
	
	public List<Booking> getAllBookings() {
		
		return BookingManager.getAllBookings();
		
	}
	
	
	public boolean addBooking(Booking bookingId) {
		
		return BookingManager.addBooking(bookingId);
		
	}
	
	
	public boolean updateBooking(Booking bookingId) {
		
		return BookingManager.updateBooking(bookingId);
			
	}
	
	
	public boolean deleteBooking(Booking bookingId) {
		
		return BookingManager.deleteBooking(bookingId);
		
	}
	
	

}
