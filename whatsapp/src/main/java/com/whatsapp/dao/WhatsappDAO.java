package com.whatsapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.whatsapp.entity.WhatsappUser;

public class WhatsappDAO implements WhatsappDAOInterface {

	public int createProfileDAO(WhatsappUser wu) {
		int i=0;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/happiestmind","root","rajesh");
			PreparedStatement ps=con.prepareStatement("insert into whatsappuser values(?,?,?,?)");
			ps.setString(1, wu.getName());
			ps.setString(2,wu.getPassword() );
			ps.setString(3, wu.getEmail());
			ps.setString(4, wu.getAddress());
			
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}
	
	public List<WhatsappUser> viewAllProfile() {
		List<WhatsappUser> ll=new ArrayList<WhatsappUser>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/happiestmind","root","rajesh");
			PreparedStatement ps=con.prepareStatement("select * from whatsappuser");
			ResultSet res=ps.executeQuery();
			while(res.next()) {
				WhatsappUser w1=new WhatsappUser();
				w1.setName(res.getString(1));
				w1.setPassword(res.getString(2));
				w1.setEmail(res.getString(3));
				w1.setAddress(res.getString(4));
				ll.add(w1);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ll;
	}

}












