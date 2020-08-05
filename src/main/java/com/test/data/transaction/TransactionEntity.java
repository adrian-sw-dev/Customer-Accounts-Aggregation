package com.test.data.transaction;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.test.data.account.Account;

@Entity
@Table(name = "transactions")
public class TransactionEntity {

	@Id
	private String id;
	private String currency;
	private Double amount;
	private String description;
	
	@ManyToOne
	private Account account;
	
	public TransactionEntity() {
		
	}
	
	public TransactionEntity(String id, String currency, Double amount, String description, Account account) {
		this.id = id;
		this.currency = currency;
		this.amount = amount;
		this.description = description;
		this.account = account;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
