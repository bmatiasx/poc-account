package com.andromedacodealab.consultafijapoc.account.repository;

import com.andromedacodealab.consultafijapoc.account.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    /*Customer findByDni(Integer dni);*/

    Customer findByAccountId(Long accountId);
}