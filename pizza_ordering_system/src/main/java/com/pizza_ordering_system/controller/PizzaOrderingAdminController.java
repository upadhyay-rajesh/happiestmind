package com.pizza_ordering_system.controller;

import java.util.Scanner;

import com.pizza_ordering_system.entity.StoreBean;
import com.pizza_ordering_system.service.PizzaOrderingAdminService;
import com.pizza_ordering_system.service.PizzaOrderingAdminServiceInterface;

public class PizzaOrderingAdminController implements PizzaOrderingAdminControllerInterface {

	public void addPizzaStore() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter store name");
		String name=sc.next();
		System.out.println("Enter city");
		String city=sc.next();
		System.out.println("Enter mobile no");
		String mobileNo=sc.next();
		System.out.println("Enter store pin code");
		String pincode=sc.next();
		System.out.println("Enter store state");
		String state=sc.next();
		System.out.println("Enter store street");
		String street=sc.next();
		System.out.println("Enter store store id");
		String storeId=sc.next();
		
		StoreBean storebean=new StoreBean();
		storebean.setName(name);
		storebean.setCity(city);
		storebean.setMobileNo(mobileNo);
		storebean.setPincode(pincode);
		storebean.setState(state);
		storebean.setStreet(street);
		storebean.setStoreID(storeId);
		
		
		PizzaOrderingAdminServiceInterface pizzaService =new PizzaOrderingAdminService();
		String result= pizzaService.addStore(storebean);
		
		if(result.equals("SUCCESS")) {
			System.out.println("store registered successfully");
		}
		else {
			System.out.println("Registration fail");
		}
		
	}

	public void deletePizzaStore() {
		PizzaOrderingAdminServiceInterface pizzaService =new PizzaOrderingAdminService();

	}

	public void editPizzaStore() {
		PizzaOrderingAdminServiceInterface pizzaService =new PizzaOrderingAdminService();

	}

	public void viewPizzaStore() {
		PizzaOrderingAdminServiceInterface pizzaService =new PizzaOrderingAdminService();

	}

	public void deleteFood() {
		PizzaOrderingAdminServiceInterface pizzaService =new PizzaOrderingAdminService();

	}

	public void editFood() {
		PizzaOrderingAdminServiceInterface pizzaService =new PizzaOrderingAdminService();

	}

	public void addFood() {
		PizzaOrderingAdminServiceInterface pizzaService =new PizzaOrderingAdminService();

	}

	public void viewFood() {
		PizzaOrderingAdminServiceInterface pizzaService =new PizzaOrderingAdminService();

	}

	public void changePassword() {
		PizzaOrderingAdminServiceInterface pizzaService =new PizzaOrderingAdminService();

	}

	public void changeOrderStatus() {
		PizzaOrderingAdminServiceInterface pizzaService =new PizzaOrderingAdminService();

	}

	public void logout() {
		PizzaOrderingAdminServiceInterface pizzaService =new PizzaOrderingAdminService();

	}

}
