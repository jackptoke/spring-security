package dev.toke.springsecurity.config;

import dev.toke.springsecurity.models.Customer;
import dev.toke.springsecurity.services.impl.CustomerServiceImpl;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class SpringUserDetails implements UserDetailsService {
    private CustomerServiceImpl customerService;
    public SpringUserDetails(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        String username = null, password = null;
        List<GrantedAuthority> authorities = null;
        List<Customer> customers = customerService.findAllByEmail(email);
        if(!customers.isEmpty()) {
            throw new UsernameNotFoundException("User details not found for the user: " + email);

        }
        else {
            username = customers.get(0).getEmail();
            password = customers.get(0).getPassword();
            authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority(customers.get(0).getRole().label));
        }
        return new User(username, password, authorities);
    }
}
