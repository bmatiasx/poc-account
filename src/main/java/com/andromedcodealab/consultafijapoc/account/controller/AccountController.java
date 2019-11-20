package com.andromedcodealab.consultafijapoc.account.controller;

import com.andromedcodealab.consultafijapoc.account.model.Customer;
import com.andromedcodealab.consultafijapoc.account.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
@Secured("ROLE_USER")
public class AccountController {

    private Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private CustomerService customerService;

    @GetMapping(path = "/{accountId}")
    public Customer getCustomerByAccountNumber(@PathVariable(value = "accountId", required = true) Long accountId) {
        logger.info("Method 'getCustomerByAccountNumber' was called for Account N°: " + accountId);
        return customerService.findByAccountId(accountId);
    }
}
