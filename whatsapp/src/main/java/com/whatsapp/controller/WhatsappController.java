package com.whatsapp.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.whatsapp.entity.WhatsappUser;
import com.whatsapp.service.WhatsappService;
import com.whatsapp.service.WhatsappServiceInterface;

public class WhatsappController implements WhatsappControllerInterface {

	public void createProfileController() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name ");
		String name=sc.next();
		
		System.out.println("enter password ");
		String password=sc.next();

		
		System.out.println("enter email ");
		String email=sc.next();

		
		System.out.println("enter address ");
		String address=sc.next();

		WhatsappUser wu=new WhatsappUser();
		wu.setName(name);
		wu.setPassword(password);
		wu.setEmail(email);
		wu.setAddress(address);
		
		WhatsappServiceInterface ws=new WhatsappService();
		int i=ws.createProfileService(wu);
		
		if(i>0) {
			System.out.println("profile created successfully");
		}
		else {
			System.out.println("could not create profile");
		}
		

	}
	public void viewAllProfileController() {
		WhatsappServiceInterface ws=new WhatsappService();
		List<WhatsappUser> ll=ws.viewAllProfileService();
		
		System.out.println(ll.size()+" record found in database");
		
		for(int i=0;i<ll.size();i++) {
			WhatsappUser w3=ll.get(i);
			System.out.println("**********************");
			System.out.println("Name is "+w3.getName());
			System.out.println("Password is "+w3.getPassword());
			System.out.println("Email is "+w3.getEmail());
			System.out.println("Address is "+w3.getAddress());
		}
		
		Iterator<WhatsappUser> it=ll.iterator();
		while(it.hasNext()) {
			WhatsappUser w2=it.next();
			System.out.println("**********************");
			System.out.println("Name is "+w2.getName());
			System.out.println("Password is "+w2.getPassword());
			System.out.println("Email is "+w2.getEmail());
			System.out.println("Address is "+w2.getAddress());
		}
		
		ll.forEach(w->{
			System.out.println("**********************");
			System.out.println("Name is "+w.getName());
			System.out.println("Password is "+w.getPassword());
			System.out.println("Email is "+w.getEmail());
			System.out.println("Address is "+w.getAddress());
		});
		
		for(WhatsappUser ww:ll) {
			System.out.println("**********************");
			System.out.println("Name is "+ww.getName());
			System.out.println("Password is "+ww.getPassword());
			System.out.println("Email is "+ww.getEmail());
			System.out.println("Address is "+ww.getAddress());
		}
	}

}
























