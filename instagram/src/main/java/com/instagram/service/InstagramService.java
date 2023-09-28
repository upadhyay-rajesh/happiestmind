package com.instagram.service;

import java.util.List;

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

	@Override
	public List<InstagramUser> viewAllProfileService() {
		InstagramDAOInterface  id=new InstagramDAO();
		List<InstagramUser> ll=id.viewAllProfileDAO();
		return ll;
	}

}







