package com.andromedacodealab.consultafijapoc.account.repository;

import com.andromedacodealab.consultafijapoc.account.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

    List<Subscription> findAllByAccountId(Long accountId);
}
