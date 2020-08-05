package com.test.data.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	public List<Account> getAllAccounts(Integer customerId) {
		return accountRepository.findByCustomerId(customerId);
	}
	
	public void addAccount(Account account) {
		accountRepository.save(account);
	}
}
