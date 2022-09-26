package com.capg.entity;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentId;
	private String emailId;
	private String applicationId;
	private double paymentAmount;
	private String paymentDescription;
	private LocalDate paymentDate;
	private String  paymentStatus;
	
	@OneToOne(mappedBy="payment")
	private Application application;
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(int paymentId, String emailId, String applicationId, double paymentAmount, String paymentDescription,
			LocalDate paymentDate, String paymentStatus) {
		super();
		this.paymentId = paymentId;
		this.emailId = emailId;
		this.applicationId = applicationId;
		this.paymentAmount = paymentAmount;
		this.paymentDescription = paymentDescription;
		this.paymentDate = paymentDate;
		this.paymentStatus = paymentStatus;
	}
	
}
