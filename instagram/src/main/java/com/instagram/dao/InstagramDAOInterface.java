package com.instagram.dao;

import java.util.List;

import com.instagram.entity.InstagramUser;

public interface InstagramDAOInterface {

	int createProfileDAO(InstagramUser iu);

	InstagramUser viewProfileDAO(InstagramUser iu);

	List<InstagramUser> viewAllProfileDAO();

}
