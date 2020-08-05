package com.test.data.account;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/accounts")
	public List<Account> getAllAccounts(HttpSession httpSession) {
		Integer customerId = (Integer) httpSession.getAttribute("CUSTOMER_ID");
		return accountService.getAllAccounts(customerId);
	}
}
