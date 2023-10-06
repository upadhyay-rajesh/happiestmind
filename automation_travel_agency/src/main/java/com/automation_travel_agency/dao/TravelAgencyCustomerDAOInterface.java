package com.automation_travel_agency.dao;

import java.util.ArrayList;

import com.automation_travel_agency.entity.ReservationBean;
import com.automation_travel_agency.entity.RouteBean;
import com.automation_travel_agency.entity.VehicleBean;

public interface TravelAgencyCustomerDAOInterface {

	ArrayList<VehicleBean> viewVehiclesByTypeDAO(String vehicleType);

	ArrayList<RouteBean> viewAllRoutesDAO();

	ArrayList<VehicleBean> viewVehicleBySeatsDAO(int noOfSeats);

	String bookVehicleDAO(ReservationBean reservationBean);

	ReservationBean printBookingDetailsDAO(String reservationID);

	boolean cancelBookingDAO(String userID, String reservationID);

	ReservationBean viewBookingDetailsdao(String reservationID);

}
