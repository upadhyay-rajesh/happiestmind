package com.automation_travel_agency.service;

import java.util.ArrayList;
import java.util.Date;

import com.automation_travel_agency.dao.TravelAgencyAdminDAO;
import com.automation_travel_agency.dao.TravelAgencyAdminDAOInterface;
import com.automation_travel_agency.entity.DriverBean;
import com.automation_travel_agency.entity.ReservationBean;
import com.automation_travel_agency.entity.RouteBean;

import com.automation_travel_agency.entity.VehicleBean;

public class TravelAgencyAdminService implements TravelAgencyAdminServiceInterface {

	

	public String addVehicle(VehicleBean vehicleBean) {
		TravelAgencyAdminDAOInterface travelAgencyDao =new TravelAgencyAdminDAO();
		String result= travelAgencyDao.addVehicleDAO(vehicleBean);
		return result;
	
	}

	public int deleteVehicle(String vehicleID) {
		TravelAgencyAdminDAOInterface travelAgencyDao =new TravelAgencyAdminDAO();
		return travelAgencyDao.deleteVehicleDAO(vehicleID);
	}

	public VehicleBean viewVehicle(String vehicleID) {
		TravelAgencyAdminDAOInterface travelAgencyDao =new TravelAgencyAdminDAO();
		return travelAgencyDao.viewVehicleDAO(vehicleID);
	}

	public boolean modifyVehicle(VehicleBean vehicleBean) {
		TravelAgencyAdminDAOInterface travelAgencyDao =new TravelAgencyAdminDAO();
		return travelAgencyDao.modifyVehicleDAO(vehicleBean);
	}

	public String addDriver(DriverBean driverBean) {
		TravelAgencyAdminDAOInterface travelAgencyDao =new TravelAgencyAdminDAO();
		return travelAgencyDao.addDriverDAO(driverBean);
	}

	public int deleteDriver(String driverID) {
		TravelAgencyAdminDAOInterface travelAgencyDao =new TravelAgencyAdminDAO();
		return travelAgencyDao.deleteDriverDAO(driverID);
	}

	public boolean allotDriver(String reservationID, String driverID) {
		TravelAgencyAdminDAOInterface travelAgencyDao =new TravelAgencyAdminDAO();
		return travelAgencyDao.allotDriverDAO(reservationID,driverID);
	}

	public boolean modifyDriver(DriverBean driverBean) {
		TravelAgencyAdminDAOInterface travelAgencyDao =new TravelAgencyAdminDAO();
		return travelAgencyDao.modifyDriverDAO(driverBean);
	}

	public String addRoute(RouteBean routeBean) {
		TravelAgencyAdminDAOInterface travelAgencyDao =new TravelAgencyAdminDAO();
		return travelAgencyDao.addRouteDAO(routeBean);
	}

	public int deleteRoute(String routeID) {
		TravelAgencyAdminDAOInterface travelAgencyDao =new TravelAgencyAdminDAO();
		return travelAgencyDao.deleteRouteDAO(routeID);
	}

	public RouteBean viewRoute(String routeID) {
		TravelAgencyAdminDAOInterface travelAgencyDao =new TravelAgencyAdminDAO();
		return travelAgencyDao.viewRouteDAO(routeID);
	}

	public boolean modifyRoute(RouteBean routeBean) {
		TravelAgencyAdminDAOInterface travelAgencyDao =new TravelAgencyAdminDAO();
		return travelAgencyDao.modifyRouteDAO(routeBean);
	}

	public ArrayList<ReservationBean> viewBookingDetails(Date journeyDate, String source, String destination) {
		TravelAgencyAdminDAOInterface travelAgencyDao =new TravelAgencyAdminDAO();
		return travelAgencyDao.viewBookingDetailsDAO(journeyDate,source,destination);
	}

	@Override
	public DriverBean viewDriver(String driverID) {
		TravelAgencyAdminDAOInterface travelAgencyDao =new TravelAgencyAdminDAO();
		return travelAgencyDao.viewDriverDetailsDAO(driverID);
	}

	@Override
	public ArrayList<DriverBean> viewAllDriverDetails() {
		TravelAgencyAdminDAOInterface travelAgencyDao =new TravelAgencyAdminDAO();
		return travelAgencyDao.viewAllDriverDetailsDAO();
	}

	
	

}
