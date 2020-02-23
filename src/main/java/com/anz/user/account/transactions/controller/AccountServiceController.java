package com.anz.user.account.transactions.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.anz.user.account.transactions.data.UserAccount;
import com.anz.user.account.transactions.data.UserAccountTransactions;
import com.anz.user.account.transactions.service.AccountService;

/**
 * 
 * @author Ayyappan
 *
 */
@RestController
public class AccountServiceController {
	
	private Logger logger = LoggerFactory.getLogger(AccountServiceController.class);
	
	@Autowired
	private AccountService accountService;
	
	/**
	 * <b>getAccountDetails</b>Controller method to get account details
	 * @param accountNo
	 * @return
	 */
	@GetMapping("/account/{accountNo}")
	public UserAccount getAccountDetails(@PathVariable String accountNo) {
		UserAccount userAccount=null;
		try {
			userAccount = accountService.getAccountDetails(accountNo);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return userAccount;
	}
	
	/**
	 * <b>getTransactionDetails</b>Controller method to get transaction details
	 * @param accountNo
	 * @return
	 */
	@GetMapping("/transaction/{accountNo}")
	public List<UserAccountTransactions> getTransactionDetails(@PathVariable String accountNo) {
		List<UserAccountTransactions> transactionList = new ArrayList<UserAccountTransactions>();
		try {
			transactionList = accountService.getTranasactionDetails(accountNo);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return transactionList;
	}
}
