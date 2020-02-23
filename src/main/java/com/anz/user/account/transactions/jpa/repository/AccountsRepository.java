package com.anz.user.account.transactions.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anz.user.account.transactions.data.UserAccount;

/**
 * 
 * @author Ayyappan
 *
 */
@Repository
public interface AccountsRepository extends JpaRepository<UserAccount,Long>{

}
