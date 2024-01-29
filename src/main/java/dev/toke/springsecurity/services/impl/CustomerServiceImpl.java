package dev.toke.springsecurity.services.impl;

import dev.toke.springsecurity.models.Customer;
import dev.toke.springsecurity.repos.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl {
    private CustomerRepo customerRepo;
    public CustomerServiceImpl(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public List<Customer> findAll() {
        return customerRepo.findAll();
    }

    public List<Customer> findAllByEmail(String email) {
        return customerRepo.findAllByEmail(email);
    }

}
