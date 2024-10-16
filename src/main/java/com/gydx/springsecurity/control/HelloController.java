package com.gydx.springsecurity.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@AuthenticationPrincipal User user) {
        return "Hello World, " + user.getUsername();
    }
}

