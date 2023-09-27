package com.instagram.service;

import com.instagram.entity.InstagramUser;

public interface InstagramServiceInterface {

	int createProfileService(InstagramUser iu);

	InstagramUser viewProfileService(InstagramUser iu);

}
