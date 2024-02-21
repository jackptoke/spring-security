package dev.toke.springsecurity.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @GetMapping
    public ResponseEntity<String> getAdmin() {
        return ResponseEntity.ok("This is admin only");
    }

    @GetMapping("/{username}/jobs")
    public ResponseEntity<String> getDetail(@PathVariable String username) {
        return ResponseEntity.ok("This contains personal info " + username);
    }
}
