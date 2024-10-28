package com.dinesh.accountws.service;
import com.dinesh.accountws.DTO.CustomerDTO;

public interface IAccountsService {

    /*
     * Create an account for a customer
     * @param customerDTO - Customer DTO Object
     */
    void createAccount(CustomerDTO customerDTO);
}
