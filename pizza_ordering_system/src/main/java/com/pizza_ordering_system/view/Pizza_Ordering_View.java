package com.pizza_ordering_system.view;

import java.util.Scanner;

import com.pizza_ordering_system.controller.PizzaOrderingAdminController;

import com.pizza_ordering_system.controller.PizzaOrderingAdminControllerInterface;
import com.pizza_ordering_system.controller.PizzaOrderingControllerController;
import com.pizza_ordering_system.controller.PizzaOrderingControllerInterface;
import com.pizza_ordering_system.controller.PizzaOrderingCustomerControllerController;
import com.pizza_ordering_system.controller.PizzaOrderingCustomerControllerInterface;

public class Pizza_Ordering_View {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ss="y";
		while(ss.equals("y")) {
		System.out.println("**************Main Menu************");
		System.out.println("press 1 to Signin");
		System.out.println("press 2 to SignUp");
				
		System.out.println("enter your choice");
		int c=sc.nextInt();
		
		PizzaOrderingControllerInterface pizzacontroller=new PizzaOrderingControllerController();
		
		switch(c) {
		case 1 : String result=pizzacontroller.SignInPizzaController();
				if(result.equals("admin")) {
					System.out.println("**************Admin Main Menu************");
					System.out.println("press 1 to Add Pizza");
					System.out.println("press 2 to Delete Pizza");
					System.out.println("press 3 to Edit Pizza");
					System.out.println("press 4 to View Pizza");
					System.out.println("press 5 to Add Food Details");
					System.out.println("press 6 to Delete Food Details");
					System.out.println("press 7 to Edit Food Details");
					System.out.println("press 8 to View Food Details");
					System.out.println("press 9 to Change Password");
					System.out.println("press 10 to Change Order Status");
					System.out.println("press 11 to Logout");
							
					System.out.println("enter your choice");
					int adminchoice=sc.nextInt();
					
					PizzaOrderingAdminControllerInterface pizzaadmincontroller=new PizzaOrderingAdminController();
					
					switch(adminchoice) {
					case 1 :pizzaadmincontroller.addPizzaStore();
						break;
					case 2 :pizzaadmincontroller.deletePizzaStore();
						break;
					case 3 :pizzaadmincontroller.editPizzaStore();
						break;
					case 4 :pizzaadmincontroller.viewPizzaStore();
						break;
					case 5 :pizzaadmincontroller.addFood();
						break;
					case 6 :pizzaadmincontroller.deleteFood();
						break;
					case 7 :pizzaadmincontroller.editFood();
						break;
					case 8 :pizzaadmincontroller.viewFood();
						break;
					case 9 :pizzaadmincontroller.changePassword();
						break;
					case 10 :pizzaadmincontroller.changeOrderStatus();
						break;
					case 11 :pizzaadmincontroller.logout();
						break;
					
						default:System.out.println("Invalid number");
					
					}
				}
				else {
					if(result.equals("customer")) {
						System.out.println("**************Customer Main Menu************");
						System.out.println("press 1 to Add Food Item to Cart");
						System.out.println("press 2 to Delete Food Item From Cart");
						System.out.println("press 3 to Edit Food Item to Cart");
						System.out.println("press 4 to View Food Item to Cart");
						System.out.println("press 5 to Modify Cart Details");
						
						System.out.println("press 6 to Change Password");
						System.out.println("press 7 to Confirm Order");
						System.out.println("press 8 to Logout");
								
						System.out.println("enter your choice");
						int customerChoice=sc.nextInt();
						
						PizzaOrderingCustomerControllerInterface pizzacustomercontroller=new PizzaOrderingCustomerControllerController();
						
						switch(customerChoice) {
						case 1 :pizzacustomercontroller.addFoodToCart();
						break;
					case 2 :pizzacustomercontroller.deleteFoodToCart();
						break;
					case 3 :pizzacustomercontroller.editFoodToCart();
						break;
					case 4 :pizzacustomercontroller.viewFoodToCart();
						break;
					case 5 :pizzacustomercontroller.changePassword();
						break;
					case 6 :pizzacustomercontroller.modifyCardDetails();
						break;
					case 7 :pizzacustomercontroller.logout();
						break;
							default:System.out.println("Invalid number");
						
						}
					}
					else {
						System.out.println("invalid id and password login again");
					}
				}
			break;
		case 2 : pizzacontroller.SignupPizzaController();
			break;
		
			default: System.out.println("wrong choice");
		}
		
		System.out.println("to continue press y");
		ss=sc.next();
		
		}

	}

}
