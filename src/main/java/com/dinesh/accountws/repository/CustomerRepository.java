package com.dinesh.accountws.repository;

import com.dinesh.accountws.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // JPA is able to generate the query for us based on the name of method.
    // This is called Derived Name methods.
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
