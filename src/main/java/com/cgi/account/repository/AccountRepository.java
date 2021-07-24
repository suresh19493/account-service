package com.cgi.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cgi.account.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

}
