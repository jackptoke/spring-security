package dev.toke.springsecurity.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @GetMapping
    public ResponseEntity<String> getAccounts() {
      return ResponseEntity.ok("This is accounts endpoint");
    }



}
