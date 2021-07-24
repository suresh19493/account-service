package com.cgi.account.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cgi.account.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

	@Query(value = "select * from account_transaction where account_number=:accountNumber", nativeQuery = true)
	public List<Transaction> getAllTransactionsByAccountId(@Param("accountNumber") Integer accountNumber);

}
