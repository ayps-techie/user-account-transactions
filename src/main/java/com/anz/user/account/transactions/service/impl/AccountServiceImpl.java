package com.anz.user.account.transactions.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anz.user.account.transactions.data.UserAccount;
import com.anz.user.account.transactions.data.UserAccountTransactions;
import com.anz.user.account.transactions.jpa.repository.AccountsRepository;
import com.anz.user.account.transactions.jpa.repository.TransactionRepository;
import com.anz.user.account.transactions.service.AccountService;

/**
 * 
 * @author Ayyappan
 *
 */
@Service
public class AccountServiceImpl implements AccountService{
	
	private Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);
   
	@Autowired
	private AccountsRepository accountsRepository;
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	@Override
	public UserAccount getAccountDetails(String accountNo) throws Exception {
		UserAccount accountDetails = null;
		try {
			Optional<UserAccount> userAccount = accountsRepository.findById(Long.valueOf(accountNo));
			if(userAccount.isPresent()) {
				accountDetails = userAccount.get();
			}else {
				accountDetails=new UserAccount();
			}
		}catch(Exception e) {
			logger.error(e.getMessage());
		}
	    return accountDetails;
	}

	@Override
	public List<UserAccountTransactions> getTranasactionDetails(String accountNo) throws Exception {
		List<UserAccountTransactions> transactionList= new ArrayList<UserAccountTransactions>();
		try {
			transactionList = transactionRepository.getTranasactionDetails(accountNo);
		}catch(Exception e) {
			logger.error(e.getMessage());
		}
		return transactionList;
	}
	
}
