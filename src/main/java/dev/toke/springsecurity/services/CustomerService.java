package dev.toke.springsecurity.services;

import dev.toke.springsecurity.models.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAll();
    List<Customer> findAllByEmail(String email);
    Optional<Customer> findByEmail(String email);
    Customer register(Customer customer);
    Customer save(Customer customer);
}
