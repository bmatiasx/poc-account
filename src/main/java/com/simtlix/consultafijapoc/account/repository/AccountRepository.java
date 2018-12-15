package com.simtlix.consultafijapoc.account.repository;


import com.simtlix.consultafijapoc.account.model.Account;
import com.simtlix.consultafijapoc.account.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    Set<Account> findAllByClientId(Integer clientId);
}
