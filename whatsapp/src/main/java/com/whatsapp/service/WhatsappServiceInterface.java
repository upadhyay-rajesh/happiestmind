package com.whatsapp.service;

import java.util.List;

import com.whatsapp.entity.WhatsappUser;

public interface WhatsappServiceInterface {

	int createProfileService(WhatsappUser wu);
	public List<WhatsappUser> viewAllProfileService();

}
