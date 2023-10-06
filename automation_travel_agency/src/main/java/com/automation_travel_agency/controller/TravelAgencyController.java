package com.automation_travel_agency.controller;

import java.util.Scanner;

import com.automation_travel_agency.service.TravelAgencyService;
import com.automation_travel_agency.service.TravelAgencyServiceInterface;

public class TravelAgencyController implements TravelAgencyControllerInterface {

	public String SignInTravelAgencyController() {
		TravelAgencyServiceInterface travelService=new TravelAgencyService();
		Scanner sc=new Scanner(System.in);
		return null;
	}

	public void SignupTravelAgencyController() {
		Scanner sc=new Scanner(System.in);
		TravelAgencyServiceInterface travelService=new TravelAgencyService();
		
	}

	

}
