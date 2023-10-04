package com.pizza_ordering_system.service;

import com.pizza_ordering_system.dao.PizzaOrderingAdminDAO;
import com.pizza_ordering_system.dao.PizzaOrderingAdminDAOInterface;
import com.pizza_ordering_system.entity.StoreBean;

public class PizzaOrderingAdminService implements PizzaOrderingAdminServiceInterface {

	public String addStore(StoreBean storebean) {
		PizzaOrderingAdminDAOInterface pizzaDao =new PizzaOrderingAdminDAO();
		String result= pizzaDao.addStore(storebean);
		return result;
	}
	boolean modifyStore(StoreBean storebean) {
		
	}
	Int removeStore(ArrayList<String> storeId) {
		
	}
	StoreBean viewStore(String storeId) {
		
	}
	ArrayList <StoreBean> viewAllStore(){
		
	}
	String addFood(FoodBean foodbean) {
		
	}
	Return value must be either: "SUCCESS", "FAIL", “ERROR”
	boolean modifyFood(FoodBean foodbean) {
		
	}
	boolean removeFood(String storeId, String foodId) {
		
	}
	FoodBean viewFood(String foodId) {
		
	}
	ArrayList<FoodBean> viewAllFood(String storeId){
		
	}
	String changeOrderStatus(String orderId) {
		
	}

}
