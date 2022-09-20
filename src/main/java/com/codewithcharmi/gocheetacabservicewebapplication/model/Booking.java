package com.codewithcharmi.gocheetacabservicewebapplication.model;

public class Booking {
	
	private int bookingId;
	private int customerId;
	private String pickupLocation;
	private String dropoffLocation;
	private String pickupTime;
	
	
	public Booking() {
		
		
	}


	public Booking(int customerId, String pickupLocation, String dropoffLocation, String pickupTime) {
		super();
		this.customerId = customerId;
		this.pickupLocation = pickupLocation;
		this.dropoffLocation = dropoffLocation;
		this.pickupTime = pickupTime;
	}


	public Booking(int bookingId, int customerId, String pickupLocation, String dropoffLocation, String pickupTime) {
		super();
		this.bookingId = bookingId;
		this.customerId = customerId;
		this.pickupLocation = pickupLocation;
		this.dropoffLocation = dropoffLocation;
		this.pickupTime = pickupTime;
	}


	public int getBookingId() {
		return bookingId;
	}


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getPickupLocation() {
		return pickupLocation;
	}


	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}


	public String getDropoffLocation() {
		return dropoffLocation;
	}


	public void setDropoffLocation(String dropoffLocation) {
		this.dropoffLocation = dropoffLocation;
	}


	public String getPickupTime() {
		return pickupTime;
	}


	public void setPickupTime(String pickupTime) {
		this.pickupTime = pickupTime;
	}
	
	
	
	
	
	

}
