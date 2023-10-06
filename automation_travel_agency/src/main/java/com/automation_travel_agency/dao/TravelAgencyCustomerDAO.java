package com.automation_travel_agency.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.automation_travel_agency.entity.ReservationBean;
import com.automation_travel_agency.entity.RouteBean;
import com.automation_travel_agency.entity.VehicleBean;
import com.automation_travel_agency.util.DatabaseConnection;


public class TravelAgencyCustomerDAO implements TravelAgencyCustomerDAOInterface {

	public ArrayList<VehicleBean> viewVehiclesByTypeDAO(String vehicleType) {
		ArrayList<VehicleBean> ll=new ArrayList<VehicleBean>();
		
		try {
			Connection con=DatabaseConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from ATA_TBL_Vehicle where type=?");
			ResultSet res=ps.executeQuery();
			
			while(res.next()) {
				String vehicleID=res.getString(1); 
				String name=res.getString(2);
				String type=res.getString(3);
				String registrationNumber=res.getString(4);
				String seatingCapacity=res.getString(5);
				String farePerKM=res.getString(6);
				
				VehicleBean i=new VehicleBean(); 
				i.setFarePerKM(Double.parseDouble(farePerKM));
				i.setName(name);
				i.setRegistrationNumber(registrationNumber);
				i.setSeatingCapacity(Integer.parseInt(seatingCapacity));
				i.setType(type);
				i.setVehicleID(vehicleID);
				
				
				ll.add(i);//object of instagram will get inside bag i.e. ArrayList
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ll;
	}

	public ArrayList<RouteBean> viewAllRoutesDAO() {
		ArrayList<RouteBean> ll=new ArrayList<RouteBean>();//generic collection
		
		try {
			Connection con=DatabaseConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from ata_tbl_route");
			ResultSet res=ps.executeQuery();
			
			while(res.next()) {
				String routeID=res.getString(1); //fetching data of first column
				String source=res.getString(2);
				String destination=res.getString(3);
				int distance=res.getInt(4);
				int travelDuration=res.getInt(5);
				
				RouteBean i=new RouteBean(); //creating object of InstagramUser and setting all the value which came from database
				i.setDestination(destination);
				i.setDistance(distance);
				i.setRouteID(routeID);
				i.setSource(source);
				i.setTravelDuration(travelDuration);
				
				ll.add(i);//object of instagram will get inside bag i.e. ArrayList
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ll;
	}

	public ArrayList<VehicleBean> viewVehicleBySeatsDAO(int noOfSeats) {
		ArrayList<VehicleBean> ll=new ArrayList<VehicleBean>();//generic collection
		
		try {
			Connection con=DatabaseConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from ata_tbl_vehicle where SeatingCapacity=?");
			ps.setInt(1,noOfSeats);
			ResultSet res=ps.executeQuery();
			
			while(res.next()) {
				String vehicleID=res.getString(1); //fetching data of first column
				String name=res.getString(2);
				String type=res.getString(3);
				String registrationNumber=res.getString(4);
				int seatingCapacity=res.getInt(5);
				double farePerKM=res.getDouble(6);
				
				VehicleBean i=new VehicleBean(); //creating object of InstagramUser and setting all the value which came from database
				i.setFarePerKM(farePerKM);
				i.setName(name);
				i.setRegistrationNumber(registrationNumber);
				i.setSeatingCapacity(seatingCapacity);
				i.setType(type);
				i.setVehicleID(vehicleID);
				
				
				ll.add(i);//object of instagram will get inside bag i.e. ArrayList
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ll;
	}

	public String bookVehicleDAO(ReservationBean iu) {
		String i1=null;
		try {
			Connection con=DatabaseConnection.getConnection();
		
		PreparedStatement ps=con.prepareStatement("insert into ata_tbl_reservation values(?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1, iu.getReservationID());
		ps.setString(2, iu.getUserID());
		ps.setString(3, iu.getVehicleID());
		ps.setString(4, iu.getRouteID());
		ps.setString(5, iu.getBookingDate().toString());
		ps.setString(6, iu.getJourneyDate().toString());
		ps.setString(7, iu.getDriverID());
		ps.setString(8, iu.getBookingStatus());
		ps.setDouble(9, iu.getTotalFare());
		ps.setString(10, iu.getBoardingPoint());
		ps.setString(11, iu.getDropPoint());
		
		int i=ps.executeUpdate(); 
		if(i>0) {
			i1="SUCCESS";
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i1;
		
	}

	public ReservationBean printBookingDetailsDAO(String reservationID) {
		ReservationBean i=null;
		try {
			Connection con=DatabaseConnection.getConnection();
		
		PreparedStatement ps=con.prepareStatement("select * from ata_tbl_reservation where reservationID=?");
		ps.setString(1, reservationID);
		
		ResultSet res=ps.executeQuery(); 
		if(res.next()) {
			i=new ReservationBean();
			i.setReservationID(res.getString(1));
			i.setUserID(res.getString(2));
			i.setVehicleID(res.getString(3));
			i.setRouteID(res.getString(4));
			i.setBookingDate(new Date(res.getString(5)));
			i.setJourneyDate(new Date(res.getString(6)));
			i.setDriverID(res.getString(7));
			i.setBookingStatus(res.getString(8));
			i.setTotalFare(res.getDouble(9));
			i.setBoardingPoint(res.getString(10));
			i.setDropPoint(res.getString(11));
			
			
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public boolean cancelBookingDAO(String userID, String reservationID) {
		int i=0;
		boolean b=false;
		try {
		Connection con=DatabaseConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("delete from ata_tbl_reservation where reservationID=?");
		ps.setString(1,reservationID);
		
		i=ps.executeUpdate(); //for insert delete and update query
		if(i>0)
		b=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return b;
		
	}

	public ReservationBean viewBookingDetailsdao(String reservationID) {
		ReservationBean i=null;
		try {
			Connection con=DatabaseConnection.getConnection();
		
		PreparedStatement ps=con.prepareStatement("select * from ata_tbl_reservation where reservationID=?");
		ps.setString(1, reservationID);
		
		ResultSet res=ps.executeQuery(); 
		if(res.next()) {
			i=new ReservationBean();
			i.setReservationID(res.getString(1));
			i.setUserID(res.getString(2));
			i.setVehicleID(res.getString(3));
			i.setRouteID(res.getString(4));
			i.setBookingDate(new Date(res.getString(5)));
			i.setJourneyDate(new Date(res.getString(6)));
			i.setDriverID(res.getString(7));
			i.setBookingStatus(res.getString(8));
			i.setTotalFare(res.getDouble(9));
			i.setBoardingPoint(res.getString(10));
			i.setDropPoint(res.getString(11));
			
			
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

}
