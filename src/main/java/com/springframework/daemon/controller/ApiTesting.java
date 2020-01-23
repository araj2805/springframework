package com.springframework.daemon.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTesting {
    @GetMapping("/greet")
    public ResponseEntity<String> testing() throws Exception
    {
        String a = "Hi Java, I'm ankit";
        return ResponseEntity.ok(a);

    }
}
