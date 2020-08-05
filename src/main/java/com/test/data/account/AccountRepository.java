package com.test.data.account;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, String> {

	public List<Account> findByCustomerId(Integer customerId);
}
