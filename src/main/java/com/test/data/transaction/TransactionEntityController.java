package com.test.data.transaction;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionEntityController {

	@Autowired
	private TransactionEntityService transactionEntityService;
	
	@RequestMapping("/transactions")
	public List<TransactionEntity> getAllTransactions(HttpSession httpSession) {
		Integer customerId = (Integer) httpSession.getAttribute("CUSTOMER_ID");
		return transactionEntityService.getAllTransactions(customerId);
	}
}
