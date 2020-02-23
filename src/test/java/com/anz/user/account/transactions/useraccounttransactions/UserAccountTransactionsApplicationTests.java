package com.anz.user.account.transactions.useraccounttransactions;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.anz.user.account.transactions.data.UserAccount;
import com.anz.user.account.transactions.data.UserAccountTransactions;
import com.anz.user.account.transactions.service.AccountService;
import com.anz.user.account.transactions.service.impl.AccountServiceImpl;
/**
 * 
 * @author Ayyappan
 *
 */
@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class UserAccountTransactionsApplicationTests {

	@Mock
	AccountService accountService;
	
	@InjectMocks
	AccountServiceImpl accountServiceImpl;
	
	@Test
	public void testGetAccountDetails() throws Exception {
		Mockito.when(accountService.getAccountDetails("accountNo")).
		      thenReturn(new UserAccount(2000234001,"AYYAPPAN","Savings",new Date(),"INR",25000.50));
		assertNotNull(accountService.getTranasactionDetails("2000234001"));
	}
	
	@Test
	public void testGetTranasactionDetails() throws Exception {
		List<UserAccountTransactions> transactionList = new ArrayList<UserAccountTransactions>();
		transactionList.add(new UserAccountTransactions(2000234001,"AYYAPPAN",new Date(),"INR",
	    		 0.00,10000.50,"Credit",""));
		Mockito.when(accountService.getTranasactionDetails("accountNo")).
		     thenReturn(transactionList);
		assertNotNull(accountService.getTranasactionDetails("2000234001"));
		
	}

}
