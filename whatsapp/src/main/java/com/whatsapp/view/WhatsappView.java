package com.whatsapp.view;

import java.util.Scanner;

import com.whatsapp.controller.WhatsappController;
import com.whatsapp.controller.WhatsappControllerInterface;

public class WhatsappView {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ss="y";
		while(ss.equals("y")) {
			
			System.out.println("*************MAIN MENU**************");
			System.out.println("press 1 to create profile");
			System.out.println("press 2 to view all profile");
			
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			
			WhatsappControllerInterface wc=new WhatsappController();
			
			switch(choice) {
			case 1 : wc.createProfileController();
				break;
			case 2 : wc.viewAllProfileController();
			break;
				default : System.out.println("wrong choice");
			}
			
			
			System.out.println("to continue press y or n");
			ss=sc.next();
		}

	}

}
