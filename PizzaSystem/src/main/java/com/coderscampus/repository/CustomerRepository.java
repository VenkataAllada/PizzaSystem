package com.coderscampus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderscampus.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>
{
  public Customer findByEmailAddress(String username);

}
