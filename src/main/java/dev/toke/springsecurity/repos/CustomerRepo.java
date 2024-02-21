package dev.toke.springsecurity.repos;

import dev.toke.springsecurity.data.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    @Query(value = "SELECT * FROM customer WHERE email = :email", nativeQuery = true)
    List<Customer> findAllByEmail(String email);
    Customer findCustomerByEmail(String email);
}
