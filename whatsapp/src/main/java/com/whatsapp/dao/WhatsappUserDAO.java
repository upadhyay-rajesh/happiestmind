package com.whatsapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.whatsapp.entity.WhatsappUser;
import com.whatsapp.utility.DatabaseConnection;

public class WhatsappUserDAO implements WhatsappUserDAOInterface {

	public int createProfileDAO(WhatsappUser wu) {
		int i=0;
		try {
			Connection con= DatabaseConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into whatsappuser values(?,?,?,?,?)");
			ps.setString(1, wu.getName());
			ps.setString(2,wu.getPassword() );
			ps.setString(3, wu.getEmail());
			ps.setString(4,wu.getAddress() );
			ps.setString(5, wu.getRole());
			
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

}
