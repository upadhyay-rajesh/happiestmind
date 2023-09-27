package com.instagram.controller;

import java.util.Scanner;

import com.instagram.entity.InstagramUser;
import com.instagram.service.InstagramService;
import com.instagram.service.InstagramServiceInterface;

public class InstagramController implements InstagramControllerInterface {

	public void createProfileController() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name ");
		String name=sc.next();
		
		System.out.println("Enter Password ");
		String password=sc.next();
		
		System.out.println("Enter Email ");
		String email=sc.next();
		
		System.out.println("Enter Address ");
		String address=sc.next();
		
		InstagramUser iu=new InstagramUser();
		iu.setName(name);
		iu.setPassword(password);
		iu.setEmail(email);
		iu.setAddress(address);
		
		InstagramServiceInterface iservice=new InstagramService();
		
		int i=iservice.createProfileService(iu);
		
		if(i>0) {
			System.out.println("your profile created successfully");
		}
		else {
			System.out.println("oops could not create profile");
		}

	}

	public void viewProfileController() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Email to view profile");
		String email=sc.next();
		
		InstagramUser iu=new InstagramUser();
		iu.setEmail(email);
		
		InstagramServiceInterface iservice=new InstagramService();
		InstagramUser myprofile=iservice.viewProfileService(iu);
		
		if(myprofile!=null) {
			System.out.println("Name is "+myprofile.getName());
			System.out.println("Password is "+myprofile.getPassword());
			System.out.println("Email is "+myprofile.getEmail());
			System.out.println("Address is "+myprofile.getAddress());
		}
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

	public void viewAllProfileController() {
		// TODO Auto-generated method stub

	}

}
