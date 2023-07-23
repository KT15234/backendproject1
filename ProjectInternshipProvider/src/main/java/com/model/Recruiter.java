package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Recruiter {
	
	@Id
	private Long id;
	
	@Column(name = "Recruiter_Name")
	private String recName;
	private String email;
	private String company;


	public Recruiter() {
		super();
	}

	
	public Recruiter(Long id, String recName, String email, String company) {
		super();
		this.id = id;
		this.recName = recName;
		this.email = email;
		this.company = company;
	}


	// Getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRecName() {
		return recName;
	}

	public void setRecName(String recName) {
		this.recName = recName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}
	


}
