package com.pizza_ordering_system.service;

import java.util.ArrayList;

import com.pizza_ordering_system.entity.FoodBean;
import com.pizza_ordering_system.entity.StoreBean;

public interface PizzaOrderingAdminServiceInterface {

	String addStore(StoreBean storebean);
	boolean modifyStore(StoreBean storebean);
	int removeStore(ArrayList<String> storeId);
	StoreBean viewStore(String storeId);
	ArrayList<StoreBean> viewAllStore();
	String addFood(FoodBean foodbean);

	boolean modifyFood(FoodBean foodbean);
	boolean removeFood(String storeId, String foodId);
	FoodBean viewFood(String foodId);
	ArrayList<FoodBean> viewAllFood(String storeId);
	String changeOrderStatus(String orderId);

}
