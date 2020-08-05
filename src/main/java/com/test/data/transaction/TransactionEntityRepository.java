package com.test.data.transaction;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TransactionEntityRepository extends CrudRepository<TransactionEntity, String> {

	public List<TransactionEntity> findByAccountCustomerId(Integer customerId);
}
