package com.automation_travel_agency.view;

import java.util.Scanner;

import com.automation_travel_agency.controller.TravelAgencyAdminController;
import com.automation_travel_agency.controller.TravelAgencyAdminControllerInterface;
import com.automation_travel_agency.controller.TravelAgencyController;

import com.automation_travel_agency.controller.TravelAgencyControllerInterface;
import com.automation_travel_agency.controller.TravelAgencyCustomerControllerController;
import com.automation_travel_agency.controller.TravelAgencyCustomerControllerInterface;

public class TravelAgency_View {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ss="y";
		while(ss.equals("y")) {
		System.out.println("**************Main Menu************");
		System.out.println("press 1 to Signin");
		System.out.println("press 2 to SignUp");
				
		System.out.println("enter your choice");
		int c=sc.nextInt();
		
		TravelAgencyControllerInterface travelAgencycontroller=new TravelAgencyController();
		
		switch(c) {
		case 1 : String result=travelAgencycontroller.SignInTravelAgencyController();
				if(result.equals("admin")) {
					System.out.println("**************Admin Main Menu************");
					System.out.println("press 1 to Add Driver");
					System.out.println("press 2 to Delete Driver");
					System.out.println("press 3 to Edit Driver");
					System.out.println("press 4 to View Driver");
					System.out.println("press 5 to Add Vehicle");
					System.out.println("press 6 to Delete Vehicle");
					System.out.println("press 7 to Edit Vehicle");
					System.out.println("press 8 to View Vehicle");
					System.out.println("press 9 to Add Route");
					System.out.println("press 10 to Delete Route");
					System.out.println("press 11 to Edit Route");
					System.out.println("press 12 to View Route");
					System.out.println("press 13 to all driver details");
					System.out.println("press 14 to Logout");
							
					System.out.println("enter your choice");
					int adminchoice=sc.nextInt();
					
					TravelAgencyAdminControllerInterface travelagencyadmincontroller=new TravelAgencyAdminController();
					
					switch(adminchoice) {
					case 1 :travelagencyadmincontroller.addDriver();
						break;
					case 2 :travelagencyadmincontroller.deleteDriver();
						break;
					case 3 :travelagencyadmincontroller.editDriver();
						break;
					case 4 :travelagencyadmincontroller.viewDriver();
						break;
					case 5 :travelagencyadmincontroller.addVehicle();
						break;
					case 6 :travelagencyadmincontroller.deleteVehicle();
						break;
					case 7 :travelagencyadmincontroller.editVehicle();
						break;
					case 8 :travelagencyadmincontroller.viewVehicle();
						break;
					case 9 :travelagencyadmincontroller.addRoute();
					break;
				case 10 :travelagencyadmincontroller.deleteRoute();
					break;
				case 11 :travelagencyadmincontroller.editRoute();
					break;
				case 12 :travelagencyadmincontroller.viewRoute();
					break;
					case 13 :travelagencyadmincontroller.allDriverDetails();
						break;
					case 14 :travelagencyadmincontroller.logout();
						break;
					
						default:System.out.println("Invalid number");
					
					}
				}
				else {
					if(result.equals("customer")) {
						System.out.println("**************Customer Main Menu************");
						System.out.println("press 1 to vehicle route detail");
						System.out.println("press 2 to book vehicle");
						System.out.println("press 3 to cancle booking");
						System.out.println("press 4 to View booking");
						
						System.out.println("press 5 to Logout");
								
						System.out.println("enter your choice");
						int customerChoice=sc.nextInt();
						
						TravelAgencyCustomerControllerInterface travelagencycustomercontroller=new TravelAgencyCustomerControllerController();
						
						switch(customerChoice) {
						case 1 :travelagencycustomercontroller.vehicle_route_detail();
						break;
					case 2 :travelagencycustomercontroller.book_vehicle();
						break;
					case 3 :travelagencycustomercontroller.cancle_booking();
						break;
					case 4 :travelagencycustomercontroller.View_booking();
						break;
				
					case 5 :travelagencycustomercontroller.logout();
						break;
							default:System.out.println("Invalid number");
						
						}
					}
					else {
						System.out.println("invalid id and password login again");
					}
				}
			break;
		case 2 : travelAgencycontroller.SignupTravelAgencyController();
			break;
		
			default: System.out.println("wrong choice");
		}
		
		System.out.println("to continue press y");
		ss=sc.next();
		
		}

	}

}
