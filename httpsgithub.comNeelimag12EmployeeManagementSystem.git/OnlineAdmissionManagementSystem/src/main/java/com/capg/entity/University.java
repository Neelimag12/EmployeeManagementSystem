package com.capg.entity;

import java.util.ArrayList;

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
	}
