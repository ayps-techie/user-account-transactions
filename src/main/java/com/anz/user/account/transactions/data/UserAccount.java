package com.anz.user.account.transactions.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * @author Ayyappan
 *
 */
@Entity
@Table(name="USER_ACCOUNTS")
public class UserAccount implements Serializable{
    
	private static final long serialVersionUID = 24373889932L;
	
	@Id
	@Column(name="ACCOUNT_NUMBER")
	private long accountNumber;
	
	@Column(name="ACCOUNT_NAME")
	private String accountName;
	
	@Column(name="ACCOUNT_TYPE")
	private String accountType;
	
	@Column(name="BALANCE_DATE")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date balanceDate;
	
	@Column(name="CURRENCY")
	private String currency;
	
	@Column(name="OPEN_AVL_BALANCE")
	private double openAvlBalance;
	
	public UserAccount() {
	}

	public UserAccount(long accountNumber, String accountName, String accountType, Date balanceDate, String currency,
			double openAvlBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountType = accountType;
		this.balanceDate = balanceDate;
		this.currency = currency;
		this.openAvlBalance = openAvlBalance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
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

	public Date getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getOpenAvlBalance() {
		return openAvlBalance;
	}

	public void setOpenAvlBalance(double openAvlBalance) {
		this.openAvlBalance = openAvlBalance;
	}
	
}
