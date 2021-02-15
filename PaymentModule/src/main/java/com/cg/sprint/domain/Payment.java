package com.cg.sprint.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotBlank(message = "Name should not be empty")
	@Column(unique=true,updatable=false)
	private String name;

	@NotNull(message = "Payment should not be null")
	private double payment;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;

	@NotBlank(message = "Plan Category should not be empty")
	private String planCategory;

	public Payment() {
		super();
	}

	public Payment(int id, @NotBlank(message = "Name should not be empty") String name,
			@NotNull(message = "Payment should not be null") double payment, Date createdAt,
			@NotBlank(message = "Plan Category should not be empty") String planCategory) {
		super();
		this.id = id;
		this.name = name;
		this.payment = payment;
		this.createdAt = createdAt;
		this.planCategory = planCategory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getPlanCategory() {
		return planCategory;
	}

	public void setPlanCategory(String planCategory) {
		this.planCategory = planCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
