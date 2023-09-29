package com.whatsapp.controller;

import java.util.Scanner;

import com.whatsapp.entity.WhatsappUser;
import com.whatsapp.service.WhatsappUserService;
import com.whatsapp.service.WhatsappUserServiceInterface;

public class WhatsappUserController implements WhatsappUserControllerInterface {

	public void loginController() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter email");
		String email=sc.next();
		
		System.out.println("enter password");
		String password=sc.next();
		
		WhatsappUser wu=new WhatsappUser();
		
		wu.setPassword(password);
		wu.setEmail(email);
		
		WhatsappUserServiceInterface ws=new WhatsappUserService();
		
		WhatsappUser w=ws.loginProfile(wu);
		
		if(w!=null) {
			if(w.getRole().equals("admin")) {
				System.out.println("*******************Admin Main Menu******************");
				System.out.println("press 1 to delete profile");
				System.out.println("press 2 to view all profile");
				
				System.out.println("enter your choice");
				int c=sc.nextInt();
				
				WhatsappAdminControllerInterface wac=new WhatsappAdminController();
				
				switch(c) {
				case 1: 
					break;
				case 2 : break;
				default : System.out.println("wrong choice");
				}
			}
			else {
				System.out.println("*******************User Main Menu******************");
				System.out.println("press 1 to view profile");
				System.out.println("press 2 to delete profile");
				System.out.println("press 3 to edit profile");
				System.out.println("press 4 to search profile");
				
				System.out.println("enter your choice");
				int c=sc.nextInt();
				
				switch(c) {
				case 1: break;
				case 2 : break;
				default : System.out.println("wrong choice");
				}
			}
		}
		else {
			System.out.println("Invalid id and password login again");
		}

	}

	public void registerController() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter password");
		String password=sc.next();
		
		System.out.println("enter email");
		String email=sc.next();
		
		System.out.println("enter address");
		String address=sc.next();
		
		System.out.println("enter role");
		String role=sc.next();
		
		WhatsappUser wu=new WhatsappUser();
		wu.setName(name);
		wu.setPassword(password);
		wu.setEmail(email);
		wu.setAddress(address);
		wu.setRole(role);
		
		WhatsappUserServiceInterface ws=new WhatsappUserService();
		
		int i=ws.createProfileService(wu);
		if(i>0) {
			System.out.println("profile created");
		}

	}

}
