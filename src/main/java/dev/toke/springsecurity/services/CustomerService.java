package dev.toke.springsecurity.services;

import dev.toke.springsecurity.models.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    List<Customer> findAllByEmail(String email);
}
