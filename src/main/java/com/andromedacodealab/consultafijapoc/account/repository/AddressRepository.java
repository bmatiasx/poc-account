package com.andromedacodealab.consultafijapoc.account.repository;

import com.andromedacodealab.consultafijapoc.account.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {

    List<Address> findAllByAccountId(Long accountId);
}
