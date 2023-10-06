package com.automation_travel_agency.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.automation_travel_agency.entity.ReservationBean;
import com.automation_travel_agency.entity.RouteBean;
import com.automation_travel_agency.service.TravelAgencyCustomerService;
import com.automation_travel_agency.service.TravelAgencyCustomerServiceInterface;
import com.automation_travel_agency.service.TravelAgencyService;
import com.automation_travel_agency.service.TravelAgencyServiceInterface;

public class TravelAgencyCustomerControllerController implements TravelAgencyCustomerControllerInterface {

	public void logout() {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter user id ");
		String userId=sc.next();
		TravelAgencyServiceInterface travelService=new TravelAgencyService();
		boolean b=travelService.logout(userId);
		
		if(b) {
			System.out.println("logout successful");
			System.exit(0);
		}
		else {
			System.out.println("logout unsuccessful");
		}
		
	}

	public void vehicle_route_detail() {
		Scanner sc=new Scanner(System.in);
		TravelAgencyCustomerServiceInterface travelService=new TravelAgencyCustomerService();
		ArrayList<RouteBean> allRoute=travelService.viewAllRoutes();
		
		allRoute.forEach(t->{
			System.out.println("Route id is "+t.getRouteID());
			System.out.println("Source is "+t.getSource());
			System.out.println("Destination is "+t.getDestination());
			System.out.println("Distance is "+t.getDistance());
			System.out.println("Travel Duration is "+t.getTravelDuration());
		});
	}

	public void book_vehicle() {
		Scanner sc=new Scanner(System.in);
		TravelAgencyCustomerServiceInterface travelService=new TravelAgencyCustomerService();
		 ReservationBean reservationBean =new ReservationBean();
		String result=travelService.bookVehicle(reservationBean);
		System.out.println(result);
		
	}

	public void View_booking() {
		Scanner sc=new Scanner(System.in);
		TravelAgencyCustomerServiceInterface travelService=new TravelAgencyCustomerService();
		System.out.println("please enter the reservation id");
		String reservationID=sc.next();
		 ReservationBean rbean= travelService.viewBookingDetails(reservationID);
		 
		 if(rbean!=null) {
			 System.out.println("your reservation detail is below");
			 System.out.println("Boarding Point is "+rbean.getBoardingPoint());
			 System.out.println("Booking Status is "+rbean.getBookingStatus());
			 System.out.println("Drop Point is "+rbean.getDropPoint());
			 System.out.println("Total Fare is "+rbean.getTotalFare());
			 System.out.println("Booking Date is "+rbean.getBookingDate());
			 System.out.println("Vehicle Id is "+rbean.getVehicleID());
			 System.out.println("Journey Date is "+rbean.getJourneyDate());
			 
		 }
		 else {
			 System.out.println("you do not have any ride right now");
		 }
		
	}

	public void cancle_booking() {
		Scanner sc=new Scanner(System.in);
		TravelAgencyCustomerServiceInterface travelService=new TravelAgencyCustomerService();
		System.out.println("please enter user id ");
		String userID=sc.next();
		System.out.println("please enter reservation id ");
		String reservationID=sc.next();
		boolean b=travelService.cancelBooking(userID, reservationID);
		if(b) {
			System.out.println("your booking got cancled");
		}
		else {
			System.out.println("could not cancle booking");
		}
		
	}

	
}
