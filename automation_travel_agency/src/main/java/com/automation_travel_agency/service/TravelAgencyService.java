package com.automation_travel_agency.service;

import com.automation_travel_agency.dao.TravelAgencyAdminDAO;
import com.automation_travel_agency.dao.TravelAgencyAdminDAOInterface;
import com.automation_travel_agency.dao.TravelAgencyDAO;
import com.automation_travel_agency.dao.TravelAgencyDAOInterface;
import com.automation_travel_agency.entity.CredentialsBean;
import com.automation_travel_agency.entity.ProfileBean;

public class TravelAgencyService implements TravelAgencyServiceInterface {

	public String login(CredentialsBean credentialsBean) {
		TravelAgencyDAOInterface travelAgencyDao =new TravelAgencyDAO();
		return travelAgencyDao.loginDAO( credentialsBean);
	}

	public boolean logout(String userId) {
		TravelAgencyDAOInterface travelAgencyDao =new TravelAgencyDAO();
		return travelAgencyDao.logoutDAO( userId) ;
	}

	public String changePassword(CredentialsBean credentialsBean, String newPassword) {
		TravelAgencyDAOInterface travelAgencyDao =new TravelAgencyDAO();
		return travelAgencyDao.changePasswordDAO( credentialsBean,  newPassword);
	}

	public String register(ProfileBean profileBean) {
		TravelAgencyDAOInterface travelAgencyDao =new TravelAgencyDAO();
		return travelAgencyDao.registerDAO(profileBean);
	}

}
