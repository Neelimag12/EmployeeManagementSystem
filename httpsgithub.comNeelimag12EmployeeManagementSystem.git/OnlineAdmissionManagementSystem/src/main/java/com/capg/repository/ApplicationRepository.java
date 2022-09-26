package com.capg.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.entity.Application;
import com.capg.entity.ApplicationStatus;

public interface ApplicationRepository extends JpaRepository<Application, Integer>{

	Application findByapplicationId(int app_Id);

	
}
