package com.instagram.view;

import java.util.Scanner;

import com.instagram.controller.InstagramController;
import com.instagram.controller.InstagramControllerInterface;

public class InstagramView {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ss="y";
		while(ss.equals("y")) {
			
			System.out.println("*****************MAIN MENU************");
			System.out.println("press 1 to create profile");
			System.out.println("press 2 to view profile");
			System.out.println("press 3 to edit profile");
			System.out.println("press 4 to delete profile");
			System.out.println("press 5 to search profile");
			System.out.println("press 6 to view all profile");
			
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			
			InstagramControllerInterface ic=new InstagramController();
			
			switch(choice) {
			case 1 : ic.createProfileController();
				break;
			case 2 :ic.viewProfileController();
				break;
			case 3 :ic.editProfileController();
				break;
			case 4 :ic.deleteProfileController();
				break;
			case 5 :ic.searchProfileController();
				break;
			case 6 :ic.viewAllProfileController();
				break;
				default:System.out.println("wrong choice");
			}
			
			
			System.out.println("do you want to continue press y /n");
			ss=sc.next();
		}

	}

}
