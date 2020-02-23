package com.anz.user.account.transactions.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.anz.user.account.transactions.data.UserAccountTransactions;

/**
 * 
 * @author Ayyappan
 *
 */
@Repository
public interface TransactionRepository extends JpaRepository<UserAccountTransactions,Long>{
    
	/**
	 * <b>getTranasactionDetails</b>
	 * Written customized JPA repository method since, need to get transaction details
	 * based on account no. One account no may have multiple transactions. 
	 * But default implementaion provides to fetch data based on ID (unique value). Here,
	 * we have unique id is transaction ref no. But using transaction ref no we cant fetch multiple
	 * transactions for same account no. Hence customized JPA query method written to fetch transactions
	 * based on account no.
	 * @param accountNo
	 * @return
	 */
	@Query("FROM UserAccountTransactions WHERE ACCOUNT_NUMBER = ?1")
	List<UserAccountTransactions> getTranasactionDetails(String accountNo);
}
