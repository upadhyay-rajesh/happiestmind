package com.automation_travel_agency.service;

import com.automation_travel_agency.entity.CredentialsBean;
import com.automation_travel_agency.entity.ProfileBean;

public interface TravelAgencyServiceInterface {
	String login(CredentialsBean credentialsBean) ;
	
	boolean logout(String userId) ;
	String changePassword(CredentialsBean credentialsBean, String 	newPassword) ;
	
	String register(ProfileBean profileBean);
}
