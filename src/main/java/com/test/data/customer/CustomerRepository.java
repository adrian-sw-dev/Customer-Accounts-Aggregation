package com.test.data.customer;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	public Optional<Customer> findByUsername(String username);
}
