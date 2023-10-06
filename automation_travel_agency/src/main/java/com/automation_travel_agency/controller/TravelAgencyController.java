package com.automation_travel_agency.controller;

import java.util.Date;
import java.util.Scanner;

import com.automation_travel_agency.entity.CredentialsBean;
import com.automation_travel_agency.entity.ProfileBean;
import com.automation_travel_agency.service.TravelAgencyService;
import com.automation_travel_agency.service.TravelAgencyServiceInterface;

public class TravelAgencyController implements TravelAgencyControllerInterface {

	public String SignInTravelAgencyController() {
		TravelAgencyServiceInterface travelService=new TravelAgencyService();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter user id");
		String userID=sc.next();
		System.out.println("please enter user password");
		String password=sc.next();
		
		CredentialsBean credentialsBean=new CredentialsBean();
		credentialsBean.setUserID(userID);
		credentialsBean.setPassword(password);
		
		
		String result=travelService.login(credentialsBean);
		return result;
	}

	public void SignupTravelAgencyController() {
		Scanner sc=new Scanner(System.in);
		TravelAgencyServiceInterface travelService=new TravelAgencyService();
		System.out.println("please enter user id");
		String userID=sc.next();
		System.out.println("please enter user firstName");
		String firstName=sc.next();
		System.out.println("please enter user lastName");
		String lastName=sc.next();
		System.out.println("please enter user dateOfBirth");
		String dateOfBirth=sc.next();
		System.out.println("please enter user gender");
		String gender=sc.next();
		System.out.println("please enter user street");
		String street=sc.next();
		System.out.println("please enter user location");
		String location=sc.next();
		System.out.println("please enter user city");
		String city=sc.next();
		System.out.println("please enter user state");
		String state=sc.next();
		System.out.println("please enter user pincode");
		String pincode=sc.next();
		System.out.println("please enter user mobileNo");
		String mobileNo=sc.next();
		System.out.println("please enter user emailID");
		String emailID=sc.next();
		System.out.println("please enter user password");
		String password=sc.next();
		
		ProfileBean profileBean=new ProfileBean();
		profileBean.setCity(city);
		profileBean.setDateOfBirth(dateOfBirth);
		profileBean.setEmailID(emailID);
		profileBean.setFirstName(firstName);
		profileBean.setGender(gender);
		profileBean.setLastName(lastName);
		profileBean.setLocation(location);
		profileBean.setMobileNo(mobileNo);
		profileBean.setPassword(password);
		profileBean.setPincode(pincode);
		profileBean.setState(state);
		profileBean.setStreet(street);
		profileBean.setUserID(userID);
		
		String result=travelService.register(profileBean);
		if(result.equals("SUCCESS")) {
			System.out.println("registration successful");
		}
		else {
			System.out.println("could not register");
		}
		
	}

	

}
