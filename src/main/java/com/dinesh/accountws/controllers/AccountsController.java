package com.dinesh.accountws.controllers;

import com.dinesh.accountws.DTO.CustomerDTO;
import com.dinesh.accountws.DTO.ResponseDTO;
import com.dinesh.accountws.models.Customer;
import com.dinesh.accountws.service.IAccountsService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class AccountsController {
    private IAccountsService iAccountsService;

    @GetMapping("/helloWorld")
    public String HelloWorld() {
        return "<h1> Hello World </h1>";
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAccount(@Valid @RequestBody CustomerDTO customerDTO) {
        iAccountsService.createAccount(customerDTO);
        return ResponseEntity.status(201).body(new ResponseDTO("201", "Account created successfully"));
    }

    @GetMapping("/accounts")
    public ResponseEntity<CustomerDTO> getAccountDetails(@RequestParam String mobileNumber){
        CustomerDTO customerDTO = iAccountsService.getAccountDetails(mobileNumber);
        return ResponseEntity.status(200).body(customerDTO);
    }
}
