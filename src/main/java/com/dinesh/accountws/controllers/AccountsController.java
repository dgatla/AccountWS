package com.dinesh.accountws.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {
    @GetMapping("/helloWorld")
    public String HelloWorld() {
        return "<h1> Hello World </h1>";
    }
}
