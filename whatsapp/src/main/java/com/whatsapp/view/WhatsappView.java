package com.whatsapp.view;

import java.util.Scanner;

import com.whatsapp.controller.WhatsappUserController;
import com.whatsapp.controller.WhatsappUserControllerInterface;

public class WhatsappView {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ss="y";
		while(ss.equals("y")) {
		System.out.println("*****************MAIN MENU**************");
		System.out.println("press 1 for signin");
		System.out.println("press 2 for signup");
		
		System.out.println("enter your choice");
		int c=sc.nextInt();
		
		WhatsappUserControllerInterface wc=new WhatsappUserController();
		
		switch(c) {
		case 1: wc.loginController();
			break;
		case 2 : wc.registerController();
			break;
			default : System.out.println("wrong choice");
		}
		
		System.out.println("do you want to continue press y/n");
		ss=sc.next();
		
		}

	}

}
