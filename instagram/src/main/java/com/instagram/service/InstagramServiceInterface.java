package com.instagram.service;

import java.util.List;

import com.instagram.entity.InstagramUser;

public interface InstagramServiceInterface {

	int createProfileService(InstagramUser iu);

	InstagramUser viewProfileService(InstagramUser iu);

	List<InstagramUser> viewAllProfileService();

}
