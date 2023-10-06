package com.automation_travel_agency.dao;

import com.automation_travel_agency.entity.CredentialsBean;
import com.automation_travel_agency.entity.ProfileBean;

public interface TravelAgencyDAOInterface {

	String loginDAO(CredentialsBean credentialsBean);

	boolean logoutDAO(String userId);

	String changePasswordDAO(CredentialsBean credentialsBean, String newPassword);

	String registerDAO(ProfileBean profileBean);

}
