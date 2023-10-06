package com.automation_travel_agency.service;

import java.util.ArrayList;

import com.automation_travel_agency.dao.TravelAgencyAdminDAO;
import com.automation_travel_agency.dao.TravelAgencyAdminDAOInterface;
import com.automation_travel_agency.dao.TravelAgencyCustomerDAO;
import com.automation_travel_agency.dao.TravelAgencyCustomerDAOInterface;
import com.automation_travel_agency.entity.ReservationBean;
import com.automation_travel_agency.entity.RouteBean;
import com.automation_travel_agency.entity.VehicleBean;

public class TravelAgencyCustomerService implements TravelAgencyCustomerServiceInterface {

	public ArrayList<VehicleBean> viewVehiclesByType(String vehicleType) {
		TravelAgencyCustomerDAOInterface travelAgencyDao =new TravelAgencyCustomerDAO();
		return travelAgencyDao.viewVehiclesByTypeDAO( vehicleType);
	}

	public ArrayList<VehicleBean> viewVehicleBySeats(int noOfSeats) {
		TravelAgencyCustomerDAOInterface travelAgencyDao =new TravelAgencyCustomerDAO();
		return travelAgencyDao.viewVehicleBySeatsDAO( noOfSeats);
	}

	public ArrayList<RouteBean> viewAllRoutes() {
		TravelAgencyCustomerDAOInterface travelAgencyDao =new TravelAgencyCustomerDAO();
		return travelAgencyDao.viewAllRoutesDAO();
	}

	public String bookVehicle(ReservationBean reservationBean) {
		TravelAgencyCustomerDAOInterface travelAgencyDao =new TravelAgencyCustomerDAO();
		return travelAgencyDao.bookVehicleDAO( reservationBean) ;
	}

	public boolean cancelBooking(String userID, String reservationID) {
		TravelAgencyCustomerDAOInterface travelAgencyDao =new TravelAgencyCustomerDAO();
		return travelAgencyDao.cancelBookingDAO( userID,  reservationID);
	}

	public ReservationBean viewBookingDetails(String reservationID) {
		TravelAgencyCustomerDAOInterface travelAgencyDao =new TravelAgencyCustomerDAO();
		return travelAgencyDao.viewBookingDetailsdao(reservationID);
	}

	public ReservationBean printBookingDetails(String reservationID) {
		TravelAgencyCustomerDAOInterface travelAgencyDao =new TravelAgencyCustomerDAO();
		return travelAgencyDao.printBookingDetailsDAO(reservationID);
	}

}
