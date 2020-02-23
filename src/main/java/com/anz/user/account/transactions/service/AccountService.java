package com.anz.user.account.transactions.service;

import java.util.List;

import com.anz.user.account.transactions.data.UserAccount;
import com.anz.user.account.transactions.data.UserAccountTransactions;

/**
 * 
 * @author Ayyappan
 *
 */
public interface AccountService {
    
	/**
	 * <b>getAccountDetails</b>
	 * To get account deatils
	 * @param accountNo
	 * @return
	 * @throws Exception
	 */
	public UserAccount getAccountDetails(String accountNo) throws Exception;
	
	/**
	 * <b>getTranasactionDetails</b>
	 * To get transaction details
	 * @param accountNo
	 * @return
	 * @throws Exception
	 */
	public List<UserAccountTransactions> getTranasactionDetails(String accountNo) throws Exception;

}
