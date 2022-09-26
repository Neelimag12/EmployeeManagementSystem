package com.capg.service;


import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.entity.Application;
import com.capg.entity.ApplicationStatus;
import com.capg.exception.ApplicationNotFoundException;
import com.capg.exception.EmailNotFoundException;
import com.capg.exception.IdNotFoundException;
import com.capg.repository.ApplicationRepository;

@Service
public class ApplicationServiceImpl implements ApplicationService {


	
	
	@Autowired
	private ApplicationRepository applicationrepository;
	@Override
	
	public List<Application> viewAllApplicationDetails(Application application) {
		// TODO Auto-generated method stub
		
		return applicationrepository.findAll();
	}

	@Override
	public Application getApplicationByemailId(int email_Id) throws ApplicationNotFoundException {
		// TODO Auto-generated method stub
		return ;
	}

	@Override
	public Application addApplication(Application application) {
		// TODO Auto-generated method stub
		return applicationrepository.save(application);
	}

	@Override
	public List<Application> getApplicationByStatus(ApplicationStatus status) {
		return null;
	}

	@Override
	public void deleteApplicationById(int app_Id) throws ApplicationNotFoundException {
		
		Optional<Application> application =	applicationrepository.findById(app_Id);
		if(application.isPresent())
		{
			applicationrepository.deleteById(app_Id);
		
		}
		else
			throw new IdNotFoundException("id is not present");
		
	
			
		}
	

	@Override
	public void deleteApplicationByemailId(int email_Id) throws ApplicationNotFoundException {
		// TODO Auto-generated method stub
		Optional<Application> application =	applicationrepository.findApplicationByemailId(email_Id);
		if(application.isPresent())
		{
			applicationrepository.deleteById(email_Id);
		}
		else
			throw new EmailNotFoundException("email id is not found");
			
		
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
