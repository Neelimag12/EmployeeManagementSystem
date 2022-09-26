package com.capg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String mobileNumber;
	private String aadharCardNo;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String firstName, String middleName, String lastName, String email, String mobileNumber,
			String aadharCardNo) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.aadharCardNo = aadharCardNo;
	}
	
}
