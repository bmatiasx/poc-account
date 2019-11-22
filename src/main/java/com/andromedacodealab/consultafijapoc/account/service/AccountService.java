package com.andromedacodealab.consultafijapoc.account.service;

import com.andromedacodealab.consultafijapoc.account.model.Account;
import com.andromedacodealab.consultafijapoc.account.model.Address;
import com.andromedacodealab.consultafijapoc.account.model.Customer;
import com.andromedacodealab.consultafijapoc.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class AccountService {

    private AccountRepository accountRepository;
    private com.andromedacodealab.consultafijapoc.account.service.AddressService addressService;

    @Autowired
    public AccountService(AccountRepository accountRepository, com.andromedacodealab.consultafijapoc.account.service.AddressService addressService) {
        this.accountRepository = accountRepository;
        this.addressService = addressService;
    }

    public List<Account> findAllByCustomer(Customer customer) {
        List<Address> addresses;
        Set<Account> accounts = accountRepository.findAllByClientId(customer.getClientId());
        List<Account> customerAccounts = new ArrayList<>();

        for (Account account : accounts) {
            Account customerAccount = new Account();
            addresses = addressService.findAllByAccountId(account.getAccountId());

            customerAccount.setAccountId(account.getAccountId());
            customerAccount.setAddresses(addresses);
            customerAccounts.add(customerAccount);
        }

        return customerAccounts;
    }
}
