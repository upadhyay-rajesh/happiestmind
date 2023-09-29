package com.whatsapp.service;

import com.whatsapp.dao.WhatsappUserDAO;
import com.whatsapp.dao.WhatsappUserDAOInterface;
import com.whatsapp.entity.WhatsappUser;

public class WhatsappUserService implements WhatsappUserServiceInterface {

	public int createProfileService(WhatsappUser wu) {
		WhatsappUserDAOInterface wd=new WhatsappUserDAO();
		int i=wd.createProfileDAO(wu);
		return i;
	}

}
