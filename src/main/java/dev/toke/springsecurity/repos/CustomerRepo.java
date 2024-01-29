package dev.toke.springsecurity.repos;

import dev.toke.springsecurity.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    @Query(value = "SELECT * FROM Customer WHERE email = :email", nativeQuery = true)
    List<Customer> findAllByEmail(String email);
}
