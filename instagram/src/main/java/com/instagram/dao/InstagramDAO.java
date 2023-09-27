package com.instagram.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.instagram.entity.InstagramUser;

public class InstagramDAO implements InstagramDAOInterface {

	public int createProfileDAO(InstagramUser iu) {
		int i=0;
		try {
			//step 1 load driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//step 2 create database connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/happiestmind","root","rajesh");
		
		//create query
		PreparedStatement ps=con.prepareStatement("insert into instagramuser values(?,?,?,?)");
		ps.setString(1, iu.getName());
		ps.setString(2, iu.getPassword());
		ps.setString(3, iu.getEmail());
		ps.setString(4, iu.getAddress());
		
		//step 4 execute query
		
		i=ps.executeUpdate(); //for insert delete and update query
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public InstagramUser viewProfileDAO(InstagramUser iu) {
		InstagramUser iu1=null;
		try {
			//step 1 load driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//step 2 create database connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/happiestmind","root","rajesh");
		
		//create query
		PreparedStatement ps=con.prepareStatement("select * from instagramuser where email=?");
		
		ps.setString(1, iu.getEmail());
		
		
		//step 4 execute query
		
		ResultSet i=ps.executeQuery(); //for insert delete and update query
		
		if(i.next()) {
			iu1=new InstagramUser();
			iu1.setName(i.getString(1));
			iu1.setPassword(i.getString(2));
			iu1.setEmail(i.getString(3));
			iu1.setAddress(i.getString(4));
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return iu1;
	}

}







