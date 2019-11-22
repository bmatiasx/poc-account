package com.andromedacodealab.consultafijapoc.account.service;

import com.andromedacodealab.consultafijapoc.account.model.Subscription;
import com.andromedacodealab.consultafijapoc.account.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionService {

    private SubscriptionRepository subscriptionRepository;

    @Autowired
    public SubscriptionService(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    public List<Subscription> findAllByAccountId(Long accountId) {

        return subscriptionRepository.findAllByAccountId(accountId);
    }
}
