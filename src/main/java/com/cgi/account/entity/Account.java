package com.cgi.account.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
	@Id
	@Column(name = "account_number")
	private Integer accountNumber;

	@Column(name = "account_name")
	private String accountName;

	@Column(name = "account_type")
	private String accountType;

	@Column(name = "balance_date")
	private String balanceDate;

	@Column(name = "currency")
	private String currency;

	@Column(name = "opening_availble_balance")
	private Double openingAvailbleBalance;

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

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(String balanceDate) {
		this.balanceDate = balanceDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getOpeningAvailbleBalance() {
		return openingAvailbleBalance;
	}

	public void setOpeningAvailbleBalance(Double openingAvailbleBalance) {
		this.openingAvailbleBalance = openingAvailbleBalance;
	}
}
