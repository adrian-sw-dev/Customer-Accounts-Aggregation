package com.test.data.transaction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionEntityService {

	@Autowired
	private TransactionEntityRepository transactionEntityRepository;
	
	public List<TransactionEntity> getAllTransactions(Integer customerId) {
		return transactionEntityRepository.findByAccountCustomerId(customerId);
	}
	
	public void addTransaction(TransactionEntity transactionEntity) {
		transactionEntityRepository.save(transactionEntity);
	}
}
