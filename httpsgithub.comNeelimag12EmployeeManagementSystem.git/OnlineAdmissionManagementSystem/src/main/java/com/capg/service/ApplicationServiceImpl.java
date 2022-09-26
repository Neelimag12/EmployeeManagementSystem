package com.capg.service;

import java.lang.System.Logger;
import java.util.List;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.entity.Application;
import com.capg.entity.ApplicationStatus;
import com.capg.exception.ApplicationNotFoundException;
import com.capg.repository.ApplicationRepository;

@Service
public class ApplicationServiceImpl implements ApplicationService {


	private static final Logger log = (Logger)LoggerFactory.logger(ApplicationServiceImpl.class);
	
	@Autowired
	private ApplicationRepository applicationrepository;
	@Override
	
	public List<Application> viewAllApplicationDetails(Application application) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Application getApplicationByemailId(int email_Id) throws ApplicationNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Application addApplication(Application application) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Application> getApplicationByStatus(ApplicationStatus status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Application deleteApplicationById(int app_Id) throws ApplicationNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Application deleteApplicationByemailId(int email_Id) throws ApplicationNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Application getApplicationById(int app_Id) throws ApplicationNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Application> getAllApplications() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Application> viewApplicationByStatus(ApplicationStatus status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateApplicationStatus(int applicationId, ApplicationStatus status) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
