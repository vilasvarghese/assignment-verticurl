package com.companies.assignment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Company {
	
	@Id
	private String id;
	
	private String company;
	public Company() {
		super();
	}
	
	public Company(String id, String company) {
		super();
		this.id = id;
		this.company = company;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
}
