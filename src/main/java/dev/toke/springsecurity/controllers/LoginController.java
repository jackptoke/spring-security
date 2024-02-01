package dev.toke.springsecurity.controllers;

import dev.toke.springsecurity.models.Customer;
import dev.toke.springsecurity.services.impl.CustomerServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/login")
@Slf4j
public class LoginController {
    private final CustomerServiceImpl customerService;

    public LoginController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/new")
    public ResponseEntity<String> registerUser(@RequestBody Customer customer) {
        try {
            var savedCustomer = customerService.register(customer);
            return ResponseEntity.created(new URI("/login/" + savedCustomer.getEmail())).body("Given user details are successfully registered");
        }
        catch (Exception ex) {
            return ResponseEntity.internalServerError().body("An exception occured to " + ex.getMessage());
        }
    }

    @GetMapping("/{email}")
    public ResponseEntity<Customer> getCustomer(@PathVariable String email) {
        var customers = customerService.findAllByEmail(email);
        log.info("Customers: " + customers.toString());
        if(customers.isEmpty()) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(customers.get(0));
    }

    @GetMapping("/pass")
    public ResponseEntity<String> password() {
        BCryptPasswordEncoder bEncoder = new BCryptPasswordEncoder();
        String password = bEncoder.encode("password");
        var result = customerService.findByEmail("jackptoke@gmail.com");
        if(result.isPresent()) {
            Customer customer = result.get();
            customer.setPassword(password);
            customerService.save(customer);
        }
        return ResponseEntity.ok(password);
    }

}
