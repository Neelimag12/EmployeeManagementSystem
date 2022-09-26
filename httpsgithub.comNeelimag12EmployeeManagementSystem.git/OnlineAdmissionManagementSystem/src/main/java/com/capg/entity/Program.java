package com.capg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table
public class Program {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int programId;
	private String progranName;
	private String eligibilty;
	private String duration;
	private String degreedOffered;
	@ManyToOne
	@JoinColumn(name="collegeRegId")
    private College college;
	public Program() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Program(int programId, String progranName, String eligibilty, String duration, String degreedOffered) {
		super();
		this.programId = programId;
		this.progranName = progranName;
		this.eligibilty = eligibilty;
		this.duration = duration;
		this.degreedOffered = degreedOffered;
	}
	
}
