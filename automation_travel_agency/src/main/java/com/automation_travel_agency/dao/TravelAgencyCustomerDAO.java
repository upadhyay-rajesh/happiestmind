package com.automation_travel_agency.dao;

import java.util.ArrayList;

import com.automation_travel_agency.entity.ReservationBean;
import com.automation_travel_agency.entity.RouteBean;
import com.automation_travel_agency.entity.VehicleBean;

public class TravelAgencyCustomerDAO implements TravelAgencyCustomerDAOInterface {

	public ArrayList<VehicleBean> viewVehiclesByTypeDAO(String vehicleType) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<RouteBean> viewAllRoutesDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<VehicleBean> viewVehicleBySeatsDAO(int noOfSeats) {
		// TODO Auto-generated method stub
		return null;
	}

	public String bookVehicleDAO(ReservationBean reservationBean) {
		// TODO Auto-generated method stub
		return null;
	}

	public ReservationBean printBookingDetailsDAO(String reservationID) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean cancelBookingDAO(String userID, String reservationID) {
		// TODO Auto-generated method stub
		return false;
	}

	public ReservationBean viewBookingDetailsdao(String reservationID) {
		// TODO Auto-generated method stub
		return null;
	}

}
