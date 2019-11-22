package com.andromedacodealab.consultafijapoc.account.service;

import com.andromedacodealab.consultafijapoc.account.model.Account;
import com.andromedacodealab.consultafijapoc.account.model.Customer;
import com.andromedacodealab.consultafijapoc.account.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;
    private AccountService accountService;

    @Autowired
    public CustomerService(CustomerRepository customerRepository, AccountService accountService) {
        this.customerRepository = customerRepository;
        this.accountService = accountService;
    }

    public Customer findByAccountId(Long accountId) {
        Customer customer = customerRepository.findByAccountId(accountId);

        List<Account> accounts = accountService.findAllByCustomer(customer);

        customer.setAccounts(accounts);

        return customer;
    }
}
