package com.instagram.dao;

import com.instagram.entity.InstagramUser;

public interface InstagramDAOInterface {

	int createProfileDAO(InstagramUser iu);

	InstagramUser viewProfileDAO(InstagramUser iu);

}
