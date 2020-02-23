package com.anz.user.account.transactions.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Ayyappan
 *
 */
@Entity
@Table(name="USER_ACCOUNT_TRANSACTIONS")
public class UserAccountTransactions implements Serializable{

	private static final long serialVersionUID = 237384887L;
    
	@Id
	@Column(name="TRANSACTION_NO")
	private long transactionNo;
	
	@Column(name="ACCOUNT_NUMBER")
	private long accountNumber;
	
	@Column(name="ACCOUNT_NAME")
	private String accountName;
	
	@Column(name="VALUE_DATE")
	private Date valueDate;
	
	@Column(name="CURRENCY")
	private String currency;
	
	@Column(name="DEBIT_AMOUNT")
	private double debitAmount;
	
	@Column(name="CREDIT_AMOUNT")
	private double creditAmount;
	
	@Column(name="TRANSACTION_TYPE")
	private String transactionType;
	
	@Column(name="TRANSACTION_NARRATIVE")
	private String transactionNarrative;
	
	public UserAccountTransactions() {
		
	}

	public UserAccountTransactions(long accountNumber, String accountName, Date valueDate, String currency,
			double debitAmount, double creditAmount, String transactionType, String transactionNarrative) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.valueDate = valueDate;
		this.currency = currency;
		this.debitAmount = debitAmount;
		this.creditAmount = creditAmount;
		this.transactionType = transactionType;
		this.transactionNarrative = transactionNarrative;
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

	public Date getValueDate() {
		return valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getDebitAmount() {
		return debitAmount;
	}

	public void setDebitAmount(double debitAmount) {
		this.debitAmount = debitAmount;
	}

	public double getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(double creditAmount) {
		this.creditAmount = creditAmount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getTransactionNarrative() {
		return transactionNarrative;
	}

	public void setTransactionNarrative(String transactionNarrative) {
		this.transactionNarrative = transactionNarrative;
	}
	
}
