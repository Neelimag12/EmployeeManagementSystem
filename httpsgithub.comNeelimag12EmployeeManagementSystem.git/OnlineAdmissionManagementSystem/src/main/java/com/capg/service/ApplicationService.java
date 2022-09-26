package com.capg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.entity.Application;
import com.capg.entity.ApplicationStatus;
import com.capg.exception.ApplicationNotFoundException;



@Service
public interface ApplicationService {
	
	public List<Application> viewAllApplicationDetails(Application application);
	
	public Application getApplicationByemailId(int email_Id ) throws ApplicationNotFoundException;
	
	public Application addApplication(Application application);
	
	public List<Application> getApplicationByStatus(ApplicationStatus status);
	
	public Application deleteApplicationById(int app_Id ) throws ApplicationNotFoundException;
	
	public Application deleteApplicationByemailId(int email_Id ) throws ApplicationNotFoundException;
	
	public Application getApplicationById(int app_Id ) throws ApplicationNotFoundException;
	
	
	public List<Application> getAllApplications();

	public List<Application> viewApplicationByStatus(ApplicationStatus status);
	public String updateApplicationStatus(int applicationId , ApplicationStatus status);
}
	
	

	 
	

