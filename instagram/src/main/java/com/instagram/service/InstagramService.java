package com.instagram.service;

import com.instagram.dao.InstagramDAO;
import com.instagram.dao.InstagramDAOInterface;
import com.instagram.entity.InstagramUser;

public class InstagramService implements InstagramServiceInterface {

	public int createProfileService(InstagramUser iu) {
		InstagramDAOInterface  id=new InstagramDAO();
		int i=id.createProfileDAO(iu);
		return i;
	}

	public InstagramUser viewProfileService(InstagramUser iu) {
		InstagramDAOInterface  id=new InstagramDAO();
		InstagramUser ii=id.viewProfileDAO(iu);
		return ii;
	}

}
