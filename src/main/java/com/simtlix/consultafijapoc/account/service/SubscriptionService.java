package com.simtlix.consultafijapoc.account.service;

import com.simtlix.consultafijapoc.account.model.Subscription;
import com.simtlix.consultafijapoc.account.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionService {
    @Autowired
    private SubscriptionRepository subscriptionRepository;

    public List<Subscription> findAllByAccountId(Long accountId) {

        return subscriptionRepository.findAllByAccountId(accountId);
    }
}
