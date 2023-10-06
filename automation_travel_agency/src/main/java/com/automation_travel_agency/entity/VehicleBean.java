package com.automation_travel_agency.entity;

public class VehicleBean {
	String vehicleID;
	String name;
	String	type;
	String registrationNumber;
	int seatingCapacity;
	double farePerKM;
	public String getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	public double getFarePerKM() {
		return farePerKM;
	}
	public void setFarePerKM(double farePerKM) {
		this.farePerKM = farePerKM;
	}
	
	
}
