package com.test.data.customer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name = "customers")
public class Customer {

	@Id
	private Integer id;
	private String username;
	
	public Customer() {
		
	}
	
	public Customer(Integer id) {
		this.id = id;
	}
	
	public Customer(Integer id, String username) {
		this.id = id;
		this.username = username;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
