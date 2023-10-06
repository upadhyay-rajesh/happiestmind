package com.automation_travel_agency.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.automation_travel_agency.entity.DriverBean;
import com.automation_travel_agency.entity.ReservationBean;
import com.automation_travel_agency.entity.RouteBean;

import com.automation_travel_agency.entity.VehicleBean;
import com.automation_travel_agency.util.DatabaseConnection;


public class TravelAgencyAdminDAO implements TravelAgencyAdminDAOInterface {

	public String addVehicleDAO(VehicleBean vehicleBean) {
		String i=null;
		try {
			Connection con=DatabaseConnection.getConnection();
		
		PreparedStatement ps=con.prepareStatement("insert into ATA_TBL_Vehicle values(?,?,?,?,?,?)");
		ps.setString(1, vehicleBean.getVehicleID());
		ps.setString(2, vehicleBean.getName());
		ps.setString(3, vehicleBean.getType());
		ps.setString(4, vehicleBean.getRegistrationNumber());
		ps.setInt(5, vehicleBean.getSeatingCapacity());
		ps.setDouble(6, vehicleBean.getFarePerKM());
		
		int i1=ps.executeUpdate(); 
		if(i1>0) {
			i="SUCCESS";
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
		
	}

	public int deleteVehicleDAO(String vehicleID) {
		int i=0;
		try {
		Connection con=DatabaseConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("delete from ATA_TBL_Vehicle where vehicleID=?");
		ps.setString(1, vehicleID);
		
		i=ps.executeUpdate(); //for insert delete and update query
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public VehicleBean viewVehicleDAO(String vehicleID) {
		VehicleBean iu1=null;
		try {
				Connection con=DatabaseConnection.getConnection();
		
		PreparedStatement ps=con.prepareStatement("select * from ATA_TBL_Vehicle where vehicleID=?");
		
		ps.setString(1,vehicleID);
		
		
		
		
		ResultSet i=ps.executeQuery(); 
		
		if(i.next()) {
			iu1=new VehicleBean();
			iu1.setVehicleID(i.getString(1));
			iu1.setName(i.getString(2));
			iu1.setType(i.getString(3));
			iu1.setRegistrationNumber(i.getString(4));
			iu1.setSeatingCapacity(i.getInt(5));
			iu1.setFarePerKM(i.getDouble(6));
			
		}
		
		
		}
		catch(SQLException | ClassNotFoundException   e) {
			System.out.println(e);
		}
		return iu1;
	}

	public boolean modifyVehicleDAO(VehicleBean vehicleBean) {
		boolean i=false;
		try {
			Connection con=DatabaseConnection.getConnection();
		
		PreparedStatement ps=con.prepareStatement("update ATA_TBL_Vehicle set type=?, fareperkm=? where vehicleId=?");
		ps.setString(1, vehicleBean.getType());
		ps.setDouble(2, vehicleBean.getFarePerKM());
		ps.setString(3, vehicleBean.getVehicleID());
		
		int i1=ps.executeUpdate(); 
		if(i1>0) {
			i=true;
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public String addDriverDAO(DriverBean driverBean) {
		String i=null;
		try {
			Connection con=DatabaseConnection.getConnection();
		
		PreparedStatement ps=con.prepareStatement("insert into ATA_TBL_Driver values(?,?,?,?,?,?,?,?,?)");
		ps.setString(1, driverBean.getDriverID());
		ps.setString(2, driverBean.getName());
		ps.setString(3, driverBean.getStreet());
		ps.setString(4, driverBean.getLocation());
		ps.setString(5, driverBean.getCity());
		ps.setString(6, driverBean.getState());
		ps.setString(7, driverBean.getPincode());
		ps.setString(8, driverBean.getMobileNo());
		ps.setString(9, driverBean.getLicenseNumber());
		
		int i1=ps.executeUpdate(); 
		if(i1>0) {
			i="SUCCESS";
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public boolean allotDriverDAO(String reservationID, String driverID) {
		boolean i=false;
		try {
			Connection con=DatabaseConnection.getConnection();
		
		PreparedStatement ps=con.prepareStatement("insert into ATA_TBL_Driver values(?,?,?,?)");
		//ps.setString(1, iu.getName());
		//ps.setString(2, iu.getPassword());
		//ps.setString(3, iu.getEmail());
		//ps.setString(4, iu.getAddress());
		int i1=ps.executeUpdate(); 
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public boolean modifyDriverDAO(DriverBean driverBean) {
		boolean i=false;
		try {
			Connection con=DatabaseConnection.getConnection();
		
		PreparedStatement ps=con.prepareStatement("update ATA_TBL_Driver set city=?,mobileno=? where driverId=?");
		ps.setString(1, driverBean.getCity());
		ps.setString(2, driverBean.getMobileNo());
		ps.setString(3, driverBean.getDriverID());
		
		int i1=ps.executeUpdate(); 
		if(i1>0) {
			i=true;
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public int deleteDriverDAO(String driverID) {
		int i=0;
		try {
		Connection con=DatabaseConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("delete from ATA_TBL_Driver where driverID=?");
		ps.setString(1, driverID);
		
		i=ps.executeUpdate(); //for insert delete and update query
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public String addRouteDAO(RouteBean routeBean) {
		String i=null;
		try {
			Connection con=DatabaseConnection.getConnection();
		
		PreparedStatement ps=con.prepareStatement("insert into ATA_TBL_Route values(?,?,?,?,?)");
		ps.setString(1, routeBean.getRouteID());
		ps.setString(2, routeBean.getSource());
		ps.setString(3, routeBean.getDestination());
		ps.setInt(4, routeBean.getDistance());
		ps.setInt(5, routeBean.getTravelDuration());
		
		
		int i1=ps.executeUpdate(); 
		if(i1>0) {
			i="SUCCESS";
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public int deleteRouteDAO(String routeID) {
		int i=0;
		try {
		Connection con=DatabaseConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("delete from ATA_TBL_Route where routeID=?");
		ps.setString(1,routeID);
		
		i=ps.executeUpdate(); //for insert delete and update query
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public RouteBean viewRouteDAO(String routeID) {
		RouteBean iu1=null;
		try {
				Connection con=DatabaseConnection.getConnection();
		
		PreparedStatement ps=con.prepareStatement("select * from ATA_TBL_Route where routeID=?");
		
		ps.setString(1, routeID);
		
		
		
		
		ResultSet i=ps.executeQuery(); 
		
		if(i.next()) {
			iu1=new RouteBean();
			iu1.setRouteID(i.getString(1));
			iu1.setSource(i.getString(2));
			iu1.setDestination(i.getString(3));
			iu1.setDistance(i.getInt(4));
			iu1.setTravelDuration(i.getInt(5));
		}
		
		}
		catch(SQLException | ClassNotFoundException   e) {
			System.out.println(e);
		}
		return iu1;
	}

	public boolean modifyRouteDAO(RouteBean routeBean) {
		boolean i=false;
		try {
			Connection con=DatabaseConnection.getConnection();
		
		PreparedStatement ps=con.prepareStatement("update ATA_TBL_Route set source=?,destination=? where routeId=?");
		ps.setString(1,routeBean.getSource());
		ps.setString(2, routeBean.getDestination());
		ps.setString(3, routeBean.getRouteID());
		
		int i1=ps.executeUpdate(); 
		if(i1>0) {
			i=true;
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public ArrayList<ReservationBean> viewBookingDetailsDAO(Date journeyDate, String source, String destination) {
		ArrayList<ReservationBean> ll=new ArrayList<ReservationBean>();//generic collection
		
		try {
			Connection con=DatabaseConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from ata_tbl_reservation where journeyDate=? and source=? and destination=?");
			ps.setString(1, journeyDate.toString());
			ps.setString(2, source);
			ps.setString(3, destination);
			ResultSet res=ps.executeQuery();
			
			while(res.next()) {
				ReservationBean i=new ReservationBean();
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
				String n=res.getString(1); //fetching data of first column
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				
				
				
				ll.add(i);//object of instagram will get inside bag i.e. ArrayList
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ll;
	}

	@Override
	public DriverBean viewDriverDetailsDAO(String driverID) {
		DriverBean iu1=null;
		try {
				Connection con=DatabaseConnection.getConnection();
		
		PreparedStatement ps=con.prepareStatement("select * from ata_tbl_driver where driverID=?");
		
		ps.setString(1, driverID);
		
		
		
		
		ResultSet i=ps.executeQuery(); 
		
		if(i.next()) {
			iu1=new DriverBean();
			iu1.setDriverID(i.getString(1));
			iu1.setName(i.getString(2));
			
			iu1.setStreet(i.getString(3));
			iu1.setLocation(i.getString(4));
			iu1.setCity(i.getString(5));
			iu1.setState(i.getString(6));
			iu1.setPincode(i.getString(7));
			iu1.setMobileNo(i.getString(8));
			iu1.setLicenseNumber(i.getString(9));
			
		}
		
		}
		catch(SQLException | ClassNotFoundException   e) {
			System.out.println(e);
		}
		return iu1;
	}

	@Override
	public ArrayList<DriverBean> viewAllDriverDetailsDAO() {
		ArrayList<DriverBean> ll=new ArrayList<DriverBean>();//generic collection
		
		try {
			Connection con=DatabaseConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from ata_tbl_driver");
			ResultSet i=ps.executeQuery();
			
			while(i.next()) {
				
				
				DriverBean iu1=new DriverBean(); //creating object of InstagramUser and setting all the value which came from database
				iu1.setDriverID(i.getString(1));
				iu1.setName(i.getString(2));
				
				iu1.setStreet(i.getString(3));
				iu1.setLocation(i.getString(4));
				iu1.setCity(i.getString(5));
				iu1.setState(i.getString(6));
				iu1.setPincode(i.getString(7));
				iu1.setMobileNo(i.getString(8));
				iu1.setLicenseNumber(i.getString(9));
				
				ll.add(iu1);//object of instagram will get inside bag i.e. ArrayList
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ll;
	}

	
}
