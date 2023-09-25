package com.facebook2.controller;

import java.util.Scanner;

import com.facebook2.entity.FacebookUser;

public class FacebookController implements FacebookControllerInterface{
	
	public void createProfileController() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name ");
		String name=sc.next();
		
		System.out.println("Enter your Password ");
		String password=sc.next();
		
		System.out.println("Enter your Email ");
		String email=sc.next();
		
		System.out.println("Enter your Address ");
		String address=sc.next();
		
		//above data controller have to pass to service so how it should pass?
		//via entity class object
		
		FacebookUser fuser=new FacebookUser();
		fuser.setName(name);
		fuser.setPassword(password);
		fuser.setEmail(email);
		fuser.setAddress(address);
		
		
		System.out.println("your name is "+name);
		System.out.println("Your password is "+password);
		System.out.println("Your Email is "+email);
		System.out.println("Your address is "+address);
	}

	public void viewProfileController() {
		// TODO Auto-generated method stub
		
	}

	public void editProfileController() {
		// TODO Auto-generated method stub
		
	}

	public void deleteProfileController() {
		// TODO Auto-generated method stub
		
	}

	public void searchProfileController() {
		// TODO Auto-generated method stub
		
	}

	public void viewallProfileController() {
		// TODO Auto-generated method stub
		
	}

}
