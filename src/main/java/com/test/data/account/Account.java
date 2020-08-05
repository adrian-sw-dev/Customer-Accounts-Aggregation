package com.test.data.account;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.test.data.customer.Customer;

@Entity
@Table(name = "accounts")
public class Account {

	@Id
	private String id;
	private String name;
	private String product;
	private String status;
	private Double balance;
	
	@ManyToOne
	private Customer customer;
	
	public Account() {
		
	}
	
	public Account(String id) {
		this.id = id;
	}
	
	public Account(String id, String name, String product, String status, Double balance, Customer customer) {
		this.id = id;
		this.name = name;
		this.product = product;
		this.status= status;
		this.balance = balance;
		this.customer = customer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
