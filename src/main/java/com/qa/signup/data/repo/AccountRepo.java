package com.qa.signup.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.signup.data.domain.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {

}
