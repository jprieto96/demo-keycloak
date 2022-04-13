package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApiController {

    @RequestMapping(value = "/public", method = RequestMethod.GET)
    public ResponseEntity<String> pub() {
        return ResponseEntity.ok("Hello this is public");
    }

    @RequestMapping(value = "/private", method = RequestMethod.GET)
    public ResponseEntity<String> priv() {
        return ResponseEntity.ok("Hello this is private");
    }

}
