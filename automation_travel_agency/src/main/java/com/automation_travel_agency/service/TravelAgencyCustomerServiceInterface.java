package com.automation_travel_agency.service;

import java.util.ArrayList;

import com.automation_travel_agency.entity.ReservationBean;
import com.automation_travel_agency.entity.RouteBean;
import com.automation_travel_agency.entity.VehicleBean;

public interface TravelAgencyCustomerServiceInterface {
	ArrayList<VehicleBean> viewVehiclesByType(String vehicleType) ;
	ArrayList<VehicleBean> viewVehicleBySeats(int noOfSeats) ;
	ArrayList<RouteBean> viewAllRoutes();
	String bookVehicle(ReservationBean reservationBean) ;
	boolean cancelBooking(String userID, String reservationID) ;
	ReservationBean viewBookingDetails(String reservationID) ;
	ReservationBean printBookingDetails(String reservationID);
}
