package com.whatsapp.service;

import java.util.List;

import com.whatsapp.dao.WhatsappDAO;
import com.whatsapp.dao.WhatsappDAOInterface;
import com.whatsapp.entity.WhatsappUser;

public class WhatsappService implements WhatsappServiceInterface {

	public int createProfileService(WhatsappUser wu) {
		WhatsappDAOInterface wd=new WhatsappDAO();
		int i=wd.createProfileDAO(wu);
		return i;
	}
	public List<WhatsappUser> viewAllProfileService(){
		WhatsappDAOInterface wd=new WhatsappDAO();
		List<WhatsappUser> a=wd.viewAllProfile();
		return a;
	}

}
