package dev.toke.springsecurity.config;

import dev.toke.springsecurity.data.models.Customer;
import dev.toke.springsecurity.services.impl.CustomerServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class SpringUserDetails implements UserDetailsService {
    private final CustomerServiceImpl customerService;
    public SpringUserDetails(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        String username = null, password = null;
        List<GrantedAuthority> authorities = null;
        List<Customer> customers = customerService.findAllByEmail(email);
        log.info(customers.size() + " records found.");
        if(customers.isEmpty()) {
            throw new UsernameNotFoundException("User details not found for the user: " + email);

        }
        else {
            username = customers.get(0).getEmail();
            password = customers.get(0).getPassword();
            authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority("ROLE_" + customers.get(0).getRole().label.toUpperCase()));
        }
        log.info("User: " + username + " Password: " + password + " Role: " + authorities);
        return new User(username, password, authorities);
    }
}
