package dev.toke.springsecurity.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    @Order(SecurityProperties.BASIC_AUTH_ORDER)
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((request) -> request //.anyRequest().denyAll()
                .requestMatchers("/balance", "/accounts", "/cards", "/loans").authenticated()
                .requestMatchers("/home", "/notices", "/contacts").permitAll())
                .passwordManagement(Customizer.withDefaults())
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());

        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails admin = User.withUsername("admin")
                .password("{bcrypt}property-house-vic-stawell-144071728")
                .roles("ADMIN", "USER")
                .build();

        UserDetails user = User.withUsername("nouser")
                .password("{bcrypt}property-house-vic-stawell-144071728")
                .authorities("USER")
                .build();

        return new InMemoryUserDetailsManager(admin, user);
    }
}
