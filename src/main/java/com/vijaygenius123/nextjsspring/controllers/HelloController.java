package com.vijaygenius123.nextjsspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/healthcheck")
public class HelloController {

    @GetMapping("")
    String helloWorld(Principal principal) {
        System.out.println(principal);
        return "Hello World, " + principal.getName();
    }
}
