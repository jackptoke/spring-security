package dev.toke.springsecurity.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loans")
public class LoansController {
    @GetMapping
    public ResponseEntity<String> getLoans() { return ResponseEntity.ok("Loans..."); }
}
