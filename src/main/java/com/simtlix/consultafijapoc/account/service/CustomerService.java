package com.simtlix.consultafijapoc.account.service;

import com.simtlix.consultafijapoc.account.model.Account;
import com.simtlix.consultafijapoc.account.model.Customer;
import com.simtlix.consultafijapoc.account.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AccountService accountService;

    public Customer findByAccountId(Long accountId) {
        Customer customer = customerRepository.findByAccountId(accountId);

        List<Account> accounts = accountService.findAllByCustomer(customer);

        customer.setAccounts(accounts);

        return customer;
    }
}
