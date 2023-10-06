package com.automation_travel_agency.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.automation_travel_agency.entity.DriverBean;
import com.automation_travel_agency.entity.RouteBean;
import com.automation_travel_agency.entity.VehicleBean;
import com.automation_travel_agency.service.TravelAgencyAdminService;
import com.automation_travel_agency.service.TravelAgencyAdminServiceInterface;
import com.automation_travel_agency.service.TravelAgencyService;
import com.automation_travel_agency.service.TravelAgencyServiceInterface;

public class TravelAgencyAdminController implements TravelAgencyAdminControllerInterface {

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



	public void addDriver() {
		Scanner sc=new Scanner(System.in);
		TravelAgencyAdminServiceInterface travelagencyadminService =new TravelAgencyAdminService();
		
				
		System.out.println("Enter Driver name");
		String name=sc.next();
		System.out.println("Enter Driver city");
		String city=sc.next();
		System.out.println("Enter Driver mobile no");
		String mobileNo=sc.next();
		System.out.println("Enter Driver pin code");
		String pincode=sc.next();
		System.out.println("Enter Driver state");
		String state=sc.next();
		System.out.println("Enter Driver street");
		String street=sc.next();
		System.out.println("Enter Driver id");
		String driverId=sc.next();
		System.out.println("Enter Driver Location");
		String location=sc.next();
		System.out.println("Enter Driver Licence number");
		String licenseNumber=sc.next();
		
		DriverBean driverBean =new DriverBean();
		driverBean.setName(name);
		driverBean.setCity(city);
		driverBean.setMobileNo(mobileNo);
		driverBean.setPincode(pincode);
		driverBean.setState(state);
		driverBean.setStreet(street);
		driverBean.setDriverID(driverId);
		driverBean.setLicenseNumber(licenseNumber);
		driverBean.setLocation(location);
		
		String result=travelagencyadminService.addDriver(driverBean);
		if(result!=null) {
			System.out.println("Driver registered successfully");
		}
		else {
			System.out.println("could not register driver");
		}
		
	}



	public void deleteDriver() {
		Scanner sc=new Scanner(System.in);
		TravelAgencyAdminServiceInterface travelagencyadminService =new TravelAgencyAdminService();
		
		System.out.println("please enter Driver Id");
		String driverID=sc.next();
		int result=travelagencyadminService.deleteDriver(driverID);
		if(result>0) {
			System.out.println("Driver deleted successfully");
		}
		else {
			System.out.println("could not delete driver");
		}
		
	}



	public void editDriver() {
		Scanner sc=new Scanner(System.in);
		TravelAgencyAdminServiceInterface travelagencyadminService =new TravelAgencyAdminService();
		System.out.println("please enter Driver Id");
		String driverID=sc.next();
		
		DriverBean result=travelagencyadminService.viewDriver(driverID);
		if(result!=null) {
			System.out.println("Driver old details is below");
			System.out.println("Driver name is "+result.getName());
			System.out.println("Driver mobile no is "+result.getMobileNo());
			System.out.println("Driver Licence no is "+result.getLicenseNumber());
			System.out.println("Driver City is "+result.getCity());
		}
		
		
		System.out.println("Enter Driver New city");
		String city=sc.next();
		System.out.println("Enter Driver New mobile no");
		String mobileNo=sc.next();
		System.out.println("Enter Driver New pin code");
		String pincode=sc.next();
		System.out.println("Enter Driver New state");
		String state=sc.next();
		System.out.println("Enter Driver new street");
		String street=sc.next();
		
		System.out.println("Enter Driver new Location");
		String location=sc.next();
		
		
		
		DriverBean driverBean =new DriverBean();
		driverBean.setCity(city);
		driverBean.setMobileNo(mobileNo);
		driverBean.setPincode(pincode);
		driverBean.setState(state);
		driverBean.setStreet(street);
		driverBean.setLocation(location);
		boolean result1=travelagencyadminService.modifyDriver(driverBean);
		if(result1) {
			System.out.println("Driver updated successfully");
		}
		else {
			System.out.println("could not delete driver");
		}
		
	}



	public void viewDriver() {
		Scanner sc=new Scanner(System.in);
		TravelAgencyAdminServiceInterface travelagencyadminService =new TravelAgencyAdminService();
		System.out.println("please enter Driver Id");
		String driverID=sc.next();
		
		DriverBean result=travelagencyadminService.viewDriver(driverID);
		if(result!=null) {
			System.out.println("Driver details is below");
			System.out.println("Driver name is "+result.getName());
			System.out.println("Driver mobile no is "+result.getMobileNo());
			System.out.println("Driver Licence no is "+result.getLicenseNumber());
			System.out.println("Driver City is "+result.getCity());
		}
		
	}



	public void deleteVehicle() {
		Scanner sc=new Scanner(System.in);
		TravelAgencyAdminServiceInterface travelagencyadminService =new TravelAgencyAdminService();
		System.out.println("please enter Driver Id");
		String driverID=sc.next();
		int result=travelagencyadminService.deleteDriver(driverID);
		if(result>0) {
			System.out.println("Driver deleted successfully");
		}
		else {
			System.out.println("could not delete driver");
		}
		
	}



	public void deleteRoute() {
		Scanner sc=new Scanner(System.in);
		TravelAgencyAdminServiceInterface travelagencyadminService =new TravelAgencyAdminService();
		System.out.println("please enter Driver Id");
		String driverID=sc.next();
		int result=travelagencyadminService.deleteDriver(driverID);
		if(result>0) {
			System.out.println("Driver deleted successfully");
		}
		else {
			System.out.println("could not delete driver");
		}
		
	}



	public void viewVehicle() {
		Scanner sc=new Scanner(System.in);
		TravelAgencyAdminServiceInterface travelagencyadminService =new TravelAgencyAdminService();
		System.out.println("please enter Driver Id");
		String driverID=sc.next();
		
		DriverBean result=travelagencyadminService.viewDriver(driverID);
		if(result!=null) {
			System.out.println("Driver details is below");
			System.out.println("Driver name is "+result.getName());
			System.out.println("Driver mobile no is "+result.getMobileNo());
			System.out.println("Driver Licence no is "+result.getLicenseNumber());
			System.out.println("Driver City is "+result.getCity());
		}
		
	}



	public void editVehicle() {
		Scanner sc=new Scanner(System.in);
		TravelAgencyAdminServiceInterface travelagencyadminService =new TravelAgencyAdminService();
		System.out.println("please enter Vehicle Id");
		String vehicleID=sc.next();
		
		VehicleBean result=travelagencyadminService.viewVehicle(vehicleID);
		if(result!=null) {
			System.out.println("Vehicle old details is below");
			System.out.println("Vehicle name is "+result.getName());
			System.out.println("Vehicle Registration no is "+result.getRegistrationNumber());
			System.out.println("Vehicle Type is "+result.getType());
			System.out.println("Vehicle Fare per km is "+result.getFarePerKM());
			System.out.println("Vehicle Seating capacity is "+result.getSeatingCapacity());
		}
		
		
		System.out.println("Enter vehicle new name");
		String name=sc.next();
		System.out.println("Enter vehicle new fare Per KM");
		double farePerKM=sc.nextDouble();
		System.out.println("Enter vehicle new seating Capacity");
		int seatingCapacity=sc.nextInt();
		
		System.out.println("Enter vehicle new type");
		String type=sc.next();
		
		VehicleBean vehicleBean =new VehicleBean();
		vehicleBean.setFarePerKM(farePerKM);
		vehicleBean.setName(name);
		
		vehicleBean.setSeatingCapacity(seatingCapacity);
		vehicleBean.setType(type);
		vehicleBean.setVehicleID(vehicleID);
		
		boolean result1=travelagencyadminService
		if(result1) {
			System.out.println("Driver updated successfully");
		}
		else {
			System.out.println("could not delete driver");
		}
		
	}



	public void addVehicle() {
		Scanner sc=new Scanner(System.in);
		
		TravelAgencyAdminServiceInterface travelagencyadminService =new TravelAgencyAdminService();
		System.out.println("Enter vehicle name");
		String name=sc.next();
		System.out.println("Enter vehicle fare Per KM");
		double farePerKM=sc.nextDouble();
		System.out.println("Enter vehicle seating Capacity");
		int seatingCapacity=sc.nextInt();
		System.out.println("Enter vehicle id");
		String vehicleID=sc.next();
		System.out.println("Enter vehicle type");
		String type=sc.next();
		System.out.println("Enter vehicle registration Number");
		String registrationNumber=sc.next();
		
		VehicleBean vehicleBean =new VehicleBean();
		vehicleBean.setFarePerKM(farePerKM);
		vehicleBean.setName(name);
		vehicleBean.setRegistrationNumber(registrationNumber);
		vehicleBean.setSeatingCapacity(seatingCapacity);
		vehicleBean.setType(type);
		vehicleBean.setVehicleID(vehicleID);
		
		
		
		String result=travelagencyadminService.addVehicle(vehicleBean);
		if(result!=null) {
			System.out.println("Vehicle registered successfully");
		}
		else {
			System.out.println("could not register Vehicle");
		}
		
		
	}



	public void addRoute() {
		Scanner sc=new Scanner(System.in);
		TravelAgencyAdminServiceInterface travelagencyadminService =new TravelAgencyAdminService();
				
		System.out.println("Enter travelDuration");
		int travelDuration=sc.nextInt();
		System.out.println("Enter source");
		String source=sc.next();
		System.out.println("Enter destination");
		String destination=sc.next();
		System.out.println("Enter Route id");
		String routeID=sc.next();
		System.out.println("Enter distance");
		int distance=sc.nextInt();
		
		
		RouteBean routeBean =new RouteBean();
		routeBean.setDestination(destination);
		routeBean.setDistance(distance);
		routeBean.setRouteID(routeID);
		routeBean.setSource(source);routeBean.setTravelDuration(travelDuration);
		
		String result=travelagencyadminService.addRoute(routeBean);
		if(result!=null) {
			System.out.println("Route registered successfully");
		}
		else {
			System.out.println("could not register Route");
		}
		
	}



	public void allDriverDetails() {
		Scanner sc=new Scanner(System.in);
		TravelAgencyAdminServiceInterface travelagencyadminService =new TravelAgencyAdminService();
		ArrayList<DriverBean> allRoute=travelagencyadminService.viewAllDriverDetails()
		
		allRoute.forEach(result->{
			System.out.println("**************************");
			System.out.println("Driver name is "+result.getName());
			System.out.println("Driver mobile no is "+result.getMobileNo());
			System.out.println("Driver Licence no is "+result.getLicenseNumber());
			System.out.println("Driver City is "+result.getCity());
		});
	}



	public void viewRoute() {
		Scanner sc=new Scanner(System.in);
		TravelAgencyAdminServiceInterface travelagencyadminService =new TravelAgencyAdminService();
		System.out.println("please enter Route Id");
		String routeID=sc.next();
		
		RouteBean t=travelagencyadminService.viewRoute(routeID);
		if(t!=null) {
			System.out.println("Route id is "+t.getRouteID());
			System.out.println("Source is "+t.getSource());
			System.out.println("Destination is "+t.getDestination());
			System.out.println("Distance is "+t.getDistance());
			System.out.println("Travel Duration is "+t.getTravelDuration());
		}
	}



	public void editRoute() {
		Scanner sc=new Scanner(System.in);
		TravelAgencyAdminServiceInterface travelagencyadminService =new TravelAgencyAdminService();
		System.out.println("please enter Route Id");
		String routeID=sc.next();
		
		RouteBean t=travelagencyadminService.viewRoute(routeID);
		if(t!=null) {
			System.out.println("Route id is "+t.getRouteID());
			System.out.println("Source is "+t.getSource());
			System.out.println("Destination is "+t.getDestination());
			System.out.println("Distance is "+t.getDistance());
			System.out.println("Travel Duration is "+t.getTravelDuration());
		}
		
		
		System.out.println("Enter Route New Source");
		String source=sc.next();
		System.out.println("Enter Route New Destination");
		String destination=sc.next();
		System.out.println("Enter Route New Distance");
		int distance=sc.nextInt();
		System.out.println("Enter Route New Travel Duration");
		int travelDuration=sc.nextInt();
				
		
		RouteBean routeBean =new RouteBean();
		routeBean.setDestination(destination);
		routeBean.setDistance(distance);
		routeBean.setSource(source);
		routeBean.setTravelDuration(travelDuration);
		
		
		boolean result1=travelagencyadminService.modifyRoute(routeBean);
		if(result1) {
			System.out.println("Route updated successfully");
		}
		else {
			System.out.println("could not Modify Route");
		}
	}

}
