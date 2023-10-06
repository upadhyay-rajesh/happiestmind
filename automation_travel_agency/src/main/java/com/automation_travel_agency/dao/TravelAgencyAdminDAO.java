package com.automation_travel_agency.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;

import com.automation_travel_agency.entity.DriverBean;
import com.automation_travel_agency.entity.ReservationBean;
import com.automation_travel_agency.entity.RouteBean;

import com.automation_travel_agency.entity.VehicleBean;
import com.automation_travel_agency.util.DatabaseConnection;

public class TravelAgencyAdminDAO implements TravelAgencyAdminDAOInterface {

	public String addVehicleDAO(VehicleBean vehicleBean) {
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteVehicleDAO(String vehicleID) {
		// TODO Auto-generated method stub
		return 0;
	}

	public VehicleBean viewVehicleDAO(String vehicleID) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean modifyVehicleDAO(VehicleBean vehicleBean) {
		// TODO Auto-generated method stub
		return false;
	}

	public String addDriverDAO(DriverBean driverBean) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean allotDriverDAO(String reservationID, String driverID) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean modifyDriverDAO(DriverBean driverBean) {
		// TODO Auto-generated method stub
		return false;
	}

	public int deleteDriverDAO(String driverID) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String addRouteDAO(RouteBean routeBean) {
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteRouteDAO(String routeID) {
		// TODO Auto-generated method stub
		return 0;
	}

	public RouteBean viewRouteDAO(String routeID) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean modifyRouteDAO(RouteBean routeBean) {
		// TODO Auto-generated method stub
		return false;
	}

	public ArrayList<ReservationBean> viewBookingDetailsDAO(Date journeyDate, String source, String destination) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DriverBean viewDriverDetailsDAO(String driverID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<DriverBean> viewAllDriverDetailsDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
