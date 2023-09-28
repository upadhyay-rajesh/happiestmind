package com.instagram.controller;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.instagram.entity.InstagramUser;
import com.instagram.service.InstagramService;
import com.instagram.service.InstagramServiceInterface;
import com.instagram.utility.SortByName;

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
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Email to delete profile");
		String email=sc.next();
		
		InstagramUser iu=new InstagramUser();
		iu.setEmail(email);
		
		InstagramServiceInterface iservice=new InstagramService();
		
		int i=iservice.deleteProfileService(iu);
		
		if(i>0) {
			System.out.println("your profile deleted successfully");
		}
		else {
			System.out.println("oops could not delete profile");
		}

	}

	public void searchProfileController() {
		// TODO Auto-generated method stub

	}

	public void viewAllProfileController() {
		InstagramServiceInterface iservice=new InstagramService();
		List<InstagramUser> ll=iservice.viewAllProfileService();
		
		System.out.println(ll.size()+" Record found");
		
		System.out.println("iterating list with simple for loop");
		
		for(int i=0;i<ll.size();i++) {
			InstagramUser uu=ll.get(i);
			System.out.println("****************");
			System.out.println("Name is "+uu.getName());
			System.out.println("Password is "+uu.getPassword());
			System.out.println("Email is "+uu.getEmail());
			System.out.println("Address is "+uu.getAddress());
		}
		
		System.out.println("iterating list with foreach loop");
		
		for(InstagramUser uu:ll) {
			
			System.out.println("****************");
			System.out.println("Name is "+uu.getName());
			System.out.println("Password is "+uu.getPassword());
			System.out.println("Email is "+uu.getEmail());
			System.out.println("Address is "+uu.getAddress());
		}
		
		System.out.println("iterating list with iterator loop");
		
		Iterator<InstagramUser> ii=ll.iterator();
		
		while(ii.hasNext()) {
			InstagramUser uu=ii.next();
			System.out.println("****************");
			System.out.println("Name is "+uu.getName());
			System.out.println("Password is "+uu.getPassword());
			System.out.println("Email is "+uu.getEmail());
			System.out.println("Address is "+uu.getAddress());
		}
		
		System.out.println("iterating list with lambda loop");
		
		ll.forEach(uu->{
			
			System.out.println("****************");
			System.out.println("Name is "+uu.getName());
			System.out.println("Password is "+uu.getPassword());
			System.out.println("Email is "+uu.getEmail());
			System.out.println("Address is "+uu.getAddress());
		}
		);
		
		System.out.println("list data after sorting");
		Collections.sort(ll, new SortByName());
		
		ll.forEach(uu->{
			
			System.out.println("****************");
			System.out.println("Name is "+uu.getName());
			System.out.println("Password is "+uu.getPassword());
			System.out.println("Email is "+uu.getEmail());
			System.out.println("Address is "+uu.getAddress());
		}
		);
		System.out.println("printing name with stream");
		ll.stream().map(m->m.getName()).forEach(System.out::println);
		ll.stream().filter(p->p.getAddress().equals("Chennai")).map(m->m.getName()).forEach(System.out::println);

	}

}
















