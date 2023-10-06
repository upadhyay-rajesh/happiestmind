package com.automation_travel_agency.service;

import java.util.ArrayList;
import java.util.Date;

import com.automation_travel_agency.entity.DriverBean;
import com.automation_travel_agency.entity.ReservationBean;
import com.automation_travel_agency.entity.RouteBean;
import com.automation_travel_agency.entity.VehicleBean;

public interface TravelAgencyAdminServiceInterface {

	String addVehicle(VehicleBean vehicleBean) ;
	int deleteVehicle(String vehicleID) ;
	VehicleBean viewVehicle(String vehicleID) ;
	boolean modifyVehicle(VehicleBean vehicleBean) ;
	String addDriver(DriverBean driverBean) ;
	int deleteDriver(String driverID) ;
	boolean allotDriver(String reservationID, String driverID) ;
	boolean modifyDriver(DriverBean driverBean) ;
	String addRoute(RouteBean routeBean) ;
	int deleteRoute(String routeID) ;
	RouteBean viewRoute(String routeID) ;
	
	boolean modifyRoute(RouteBean routeBean) ;
	ArrayList<ReservationBean> viewBookingDetails(Date journeyDate,String source, String destination);
	DriverBean viewDriver(String driverID);
	ArrayList<DriverBean> viewAllDriverDetails();

}
