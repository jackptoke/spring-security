package dev.toke.springsecurity.services.impl;

import dev.toke.springsecurity.models.Customer;
import dev.toke.springsecurity.repos.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Customer> findByEmail(String email) { return Optional.ofNullable(customerRepo.findCustomerByEmail(email)); }
    public Customer register(Customer customer) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(customer.getPassword());
        customer.setPassword(encodedPassword);
        return customerRepo.save(customer);
    }

    public Customer save(Customer customer) {
        return customerRepo.save(customer);
    }
}
