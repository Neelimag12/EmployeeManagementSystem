package com.capg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table

public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;
	private String city;
	private String district;
	private String state;
	private String country;
	private String zipcode;
	private String landmark;
	
	@OneToOne(mappedBy="address")
	private College college;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int addressId, String city, String district, String state, String country, String zipcode,
			String landmark) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.district = district;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.landmark = landmark;
	}
	
	
	



}
