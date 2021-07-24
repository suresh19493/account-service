package com.cgi.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.account.entity.Account;
import com.cgi.account.entity.Transaction;
import com.cgi.account.repository.AccountRepository;
import com.cgi.account.repository.TransactionRepository;

@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private TransactionRepository transactionRepository;

	public List<Account> getAllAccounts() {
		return accountRepository.findAll();
	}

	public List<Transaction> getTransactionsByAccountId(Integer accountNumber) {
		return transactionRepository.getAllTransactionsByAccountId(accountNumber);
	}
}
