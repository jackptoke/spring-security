package dev.toke.springsecurity.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loans")
@Slf4j
public class LoansController {
    @PreAuthorize("hasRole('BANANA')")
    @GetMapping("/{email}")
    public ResponseEntity<String> getLoans(@PathVariable String email) {
        log.info("Received request for " + email + " loan accounts.");
        return ResponseEntity.ok("Loans... for " + email); }
}
