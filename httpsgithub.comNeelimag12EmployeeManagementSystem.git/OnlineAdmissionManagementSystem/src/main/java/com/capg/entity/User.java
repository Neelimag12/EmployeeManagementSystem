package com.capg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.capg.dto.UserDTO;

@Entity
@Table(name="User_tbl")

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="User_id")
	private Integer userId;
	
	@Column(name="User_firstname")
	private String fname;
	

	@Column(name="User_middlename")
	private String mname;
	
	@Column(name="User_lastname")
	private String lname;
	
	@Column(name="User_email")
	private String email;
	

	@Column(name="User_mob_no")
	private String mob_no;
	

	@Column(name="Aadhar_no")
	private String aadhar_no;

  public User(UserDTO userDTO) {
	  
	  this.userId=userDTO.getUserId();
		this.fname=userDTO.getFname();
		this.mname=userDTO.getMname();
		this.lname=userDTO.getLname();
	  
	  
	  
  }
	
}
