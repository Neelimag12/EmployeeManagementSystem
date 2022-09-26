package com.capg.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table
public class Login implements Serializable {
	
	private String userId;
	private String password;
	private String role;
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String userId, String password, String role) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
	}
	
	

}
