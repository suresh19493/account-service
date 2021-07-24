package com.cgi.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.account.entity.Account;
import com.cgi.account.entity.Transaction;
import com.cgi.account.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	private AccountService accountService;

	@Autowired
	AccountController(AccountService accountService) {
		this.accountService = accountService;
	}

	@GetMapping("/all")
	public ResponseEntity<List<Account>> getAllAccounts() {
		List<Account> accountList = accountService.getAllAccounts();
		return new ResponseEntity<List<Account>>(accountList, HttpStatus.OK);
	}

	@GetMapping("/transactions/{accountNumber}")
	public ResponseEntity<List<Transaction>> getTransactionsByAccountId(
			@PathVariable("accountNumber") Integer accountNumber) {
		List<Transaction> transactionList = accountService.getTransactionsByAccountId(accountNumber);
		return new ResponseEntity<List<Transaction>>(transactionList, HttpStatus.OK);
	}
}
