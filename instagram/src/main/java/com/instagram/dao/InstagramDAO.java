package com.instagram.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.instagram.entity.InstagramUser;
import com.instagram.exceptions.EmailNotFoundException;
import com.instagram.utility.DatabaseConnection;

public class InstagramDAO implements InstagramDAOInterface {

	public int createProfileDAO(InstagramUser iu) {
		int i=0;
		try {
			//step 1 load driver
		//Class.forName("com.mysql.jdbc.Driver");
		
		//step 2 create database connection
	//	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/happiestmind","root","rajesh");
			Connection con=DatabaseConnection.getConnection();
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
		//Class.forName("com.mysql.jdbc.Driver");
		
		//step 2 create database connection
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/happiestmind","root","rajesh");
			Connection con=DatabaseConnection.getConnection();
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
		else {
			throw new EmailNotFoundException(iu.getEmail() +"does not exist in database ");
		}
		
		}
		catch(SQLException | ClassNotFoundException | EmailNotFoundException  e) {
			System.out.println(e);
		}
		return iu1;
	}

	@Override
	public List<InstagramUser> viewAllProfileDAO() {
		List<InstagramUser> ll=new ArrayList<InstagramUser>();//generic collection
		
		try {
			Connection con=DatabaseConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from instagramuser");
			ResultSet res=ps.executeQuery();
			
			while(res.next()) {
				String n=res.getString(1); //fetching data of first column
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				
				InstagramUser i=new InstagramUser(); //creating object of InstagramUser and setting all the value which came from database
				i.setName(n);
				i.setPassword(p);
				i.setEmail(e);
				i.setAddress(a);
				
				ll.add(i);//object of instagram will get inside bag i.e. ArrayList
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ll;
	}

	@Override
	public int deleteProfileDAO(InstagramUser iu) {
		int i=0;
		try {
		Connection con=DatabaseConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("delete from instagramuser where email=?");
		ps.setString(1, iu.getEmail());
		
		i=ps.executeUpdate(); //for insert delete and update query
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

}




















