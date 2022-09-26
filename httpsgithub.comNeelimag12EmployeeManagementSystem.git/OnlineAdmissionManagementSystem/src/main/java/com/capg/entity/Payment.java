package com.capg.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="payment_tbl")

public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="pay_id")
	private Integer pay_Id;
	 @OneToOne(targetEntity = Application.class,cascade = CascadeType.ALL)
	 @JoinColumns({
	    @JoinColumn(name="application_id"),
	 @JoinColumn(name="emailId")
	 })
	
	@Column(name="email_Id")
	private String email_Id;
	
	@Column(name="application_id")
	private Integer app_Id;
	
	@Column(name="payment_amt")
	private double payAmt;
	
	@Column(name="pay_Description")
	private String payDescription;
	
	@Column(name="pay_Date")
	private LocalDate payDate;
	
	@Column(name="pay_Status")
	private String payStatus;


	
	
	
	
}
