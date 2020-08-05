package com.test.data;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.data.account.Account;
import com.test.data.account.AccountService;
import com.test.data.customer.Customer;
import com.test.data.customer.CustomerService;
import com.test.data.transaction.TransactionEntity;
import com.test.data.transaction.TransactionEntityService;

@RestController
public class InitController {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private TransactionEntityService transactionEntityService;
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/init")
	public String init(HttpSession httpSession) {
		
		Boolean initDB = (Boolean) httpSession.getAttribute("INIT_DB");
		if (initDB != null) {
			return "The database has already been initialized!";
		}
		
		Customer c1 = new Customer(1, "john");
		customerService.addCustomer(c1);
		
		Customer c2 = new Customer(2, "kevin");
		customerService.addCustomer(c2);
		
		Customer c3 = new Customer(3, "mark");
		customerService.addCustomer(c3);
		
		
		Account a1 = new Account("account j_1", "name 1", "Gold account", "ENABLED", 1234.13, c1);
		accountService.addAccount(a1);
		
		Account a2 = new Account("account j_2", "name 2", "Silver account", "ENABLED", 1234.14, c1);
		accountService.addAccount(a2);
		
		Account a3 = new Account("account j_3", "name 3", "Silver account", "ENABLED", 1234.15, c1);
		accountService.addAccount(a3);
		
		Account a4 = new Account("account k_1", "name 1", "Gold account", "ENABLED", 789.23, c2);
		accountService.addAccount(a4);
		
		Account a5 = new Account("account k_2", "name 2", "Silver account", "ENABLED", 789.24, c2);
		accountService.addAccount(a5);
		
		
		TransactionEntity t1 = new TransactionEntity("transaction j_1", "EUR", 1000.13, "description 1", a1);
		transactionEntityService.addTransaction(t1);
		
		TransactionEntity t2 = new TransactionEntity("transaction j_2", "EUR", 1000.14, "description 2", a1);
		transactionEntityService.addTransaction(t2);
		
		TransactionEntity t3 = new TransactionEntity("transaction j_3", "EUR", 1000.15, "description 3", a1);
		transactionEntityService.addTransaction(t3);
		
		TransactionEntity t4 = new TransactionEntity("transaction j_4", "EUR", 1000.16, "description 4", a2);
		transactionEntityService.addTransaction(t4);
		
		TransactionEntity t5 = new TransactionEntity("transaction j_5", "EUR", 1000.17, "description 5", a2);
		transactionEntityService.addTransaction(t5);
		
		
		TransactionEntity t6 = new TransactionEntity("transaction k_1", "EUR", 300.23, "description 6", a4);
		transactionEntityService.addTransaction(t6);
		
		TransactionEntity t7 = new TransactionEntity("transaction k_2", "EUR", 300.24, "description 7", a4);
		transactionEntityService.addTransaction(t7);
		
		TransactionEntity t8 = new TransactionEntity("transaction k_3", "EUR", 300.25, "description 8", a5);
		transactionEntityService.addTransaction(t8);
		
		
		httpSession.setAttribute("INIT_DB", Boolean.TRUE);
		
		
		return "The database is completely initialized";
	}
}
