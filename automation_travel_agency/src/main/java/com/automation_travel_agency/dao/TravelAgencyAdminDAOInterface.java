package com.automation_travel_agency.dao;


import java.util.ArrayList;
import java.util.Date;

import com.automation_travel_agency.entity.DriverBean;
import com.automation_travel_agency.entity.ReservationBean;
import com.automation_travel_agency.entity.RouteBean;
import com.automation_travel_agency.entity.VehicleBean;

public interface TravelAgencyAdminDAOInterface {



	String addVehicleDAO(VehicleBean vehicleBean);

	int deleteVehicleDAO(String vehicleID);

	VehicleBean viewVehicleDAO(String vehicleID);

	boolean modifyVehicleDAO(VehicleBean vehicleBean);

	String addDriverDAO(DriverBean driverBean);

	boolean allotDriverDAO(String reservationID, String driverID);

	boolean modifyDriverDAO(DriverBean driverBean);

	int deleteDriverDAO(String driverID);

	String addRouteDAO(RouteBean routeBean);

	int deleteRouteDAO(String routeID);

	RouteBean viewRouteDAO(String routeID);

	boolean modifyRouteDAO(RouteBean routeBean);

	ArrayList<ReservationBean> viewBookingDetailsDAO(Date journeyDate, String source, String destination);

	DriverBean viewDriverDetailsDAO(String driverID);

	ArrayList<DriverBean> viewAllDriverDetailsDAO();

}
