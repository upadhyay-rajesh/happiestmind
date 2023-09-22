package com.facebook2.view;

import java.util.Scanner;

import com.facebook2.controller.FacebookController;

public class FacebookView {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ss="y";
		while(ss.equals("y")) {
		System.out.println("**************Main Menu************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to delete profile");
		System.out.println("press 4 to edit profile");
		System.out.println("press 5 to search profile");
		System.out.println("press 6 to view all profile");
		
		System.out.println("enter your choice");
		int c=sc.nextInt();
		
		FacebookController fc=new FacebookController();
		
		switch(c) {
		case 1 : fc.createProfileController();
			break;
		case 2 : fc.viewProfileController();
			break;
		case 3 : fc.deleteProfileController();
			break;
		case 4 : fc.editProfileController();
			break;
		case 5 : fc.searchProfileController();
			break;
		case 6 : fc.viewallProfileController();
			break;
			default: System.out.println("wrong choice");
		}
		
		System.out.println("to continue press y");
		ss=sc.next();
		
		}
		

	}

}
