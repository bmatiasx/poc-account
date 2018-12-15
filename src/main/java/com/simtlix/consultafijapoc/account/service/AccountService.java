package com.simtlix.consultafijapoc.account.service;

import com.simtlix.consultafijapoc.account.model.Account;
import com.simtlix.consultafijapoc.account.model.Address;
import com.simtlix.consultafijapoc.account.model.Customer;
import com.simtlix.consultafijapoc.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private AddressService addressService;

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
