package com.capg.entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class University {
	private String name;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int universityId;
	private Address address;
	
	
	private ArrayList<College> collegeList;
	
	@OneToOne(mappedBy="university")
	private College college;
	
	
	public University() {
		super();
		// TODO Auto-generated constructor stub
	}
	public University(String name, int universityId, Address address, ArrayList<College> collegeList) {
		super();
		this.name = name;
		this.universityId = universityId;
		this.address = address;
		this.collegeList = collegeList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUniversityId() {
		return universityId;
	}
	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ArrayList<College> getCollegeList() {
		return collegeList;
	}
	public void setCollegeList(ArrayList<College> collegeList) {
		this.collegeList = collegeList;
	}
	

}
