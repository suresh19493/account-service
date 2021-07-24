package com.cgi.account.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_transaction")
public class Transaction {
	@Id
	@Column(name = "transaction_id")
	private Integer transactionId;

	@Column(name = "account_number")
	private Integer accountNumber;

	@Column(name = "account_name")
	private String accountName;

	@Column(name = "value_date")
	private String valueDate;

	@Column(name = "currency")
	private String currency;

	@Column(name = "debit_amount")
	private Double debitAmount;

	@Column(name = "credit_amount")
	private Double creditAmount;

	@Column(name = "credit_debit")
	private String creditOrDebit;

	@Column(name = "transaction_narrative")
	private String transactionNarrative;

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getValueDate() {
		return valueDate;
	}

	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getDebitAmount() {
		return debitAmount;
	}

	public void setDebitAmount(Double debitAmount) {
		this.debitAmount = debitAmount;
	}

	public Double getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(Double creditAmount) {
		this.creditAmount = creditAmount;
	}

	public String getCreditOrDebit() {
		return creditOrDebit;
	}

	public void setCreditOrDebit(String creditOrDebit) {
		this.creditOrDebit = creditOrDebit;
	}

	public String getTransactionNarrative() {
		return transactionNarrative;
	}

	public void setTransactionNarrative(String transactionNarrative) {
		this.transactionNarrative = transactionNarrative;
	}
}
