package com.capg.entity;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;

@Entity
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
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getPaymentDescription() {
		return paymentDescription;
	}
	public void setPaymentDescription(String paymentDescription) {
		this.paymentDescription = paymentDescription;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	@PrePersist
	public void paymentDate() {
		paymentDate=LocalDate.now();
	}
	

}
