package com.capg.entity;

public enum ApplicationStatus {
	
	APPLIED("Applied"),
	PENDING("pending"),
	CONFIRMED("confirmed"),
	REJECTED("rejected");
	
	String value;
	
	ApplicationStatus(String value){
		this.value=value;
	}

}
