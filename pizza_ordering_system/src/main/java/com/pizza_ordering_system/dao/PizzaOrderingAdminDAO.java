package com.pizza_ordering_system.dao;

import java.sql.Connection;

import com.pizza_ordering_system.entity.StoreBean;
import com.pizza_ordering_system.util.DatabaseConnection;

public class PizzaOrderingAdminDAO implements PizzaOrderingAdminDAOInterface {

	public String addStore(StoreBean storebean) {
		Connection con=DatabaseConnection.getConnection();
		return null;
	}

}
