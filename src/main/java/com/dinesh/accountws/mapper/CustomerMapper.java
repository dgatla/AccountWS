package com.dinesh.accountws.mapper;

import com.dinesh.accountws.DTO.CustomerDTO;
import com.dinesh.accountws.models.Customer;

import java.time.LocalDateTime;

public class CustomerMapper {
    public static CustomerDTO mapToCustomerDTO(Customer customer, CustomerDTO customerDTO) {
        customerDTO.setName(customer.getName());
        customerDTO.setEmail(customer.getEmail());
        customerDTO.setMobileNumber(customer.getMobileNumber());
        return customerDTO;
    }

    public static Customer mapToCustomer(CustomerDTO customerDTO, Customer customer) {
        customer.setName(customerDTO.getName());
        customer.setEmail(customerDTO.getEmail());
        customer.setMobileNumber(customerDTO.getMobileNumber());
        customer.setCreatedBy(customerDTO.getName());
        customer.setCreatedAt(LocalDateTime.now());
        customer.setUpdatedBy(customerDTO.getName());
        customer.setUpdatedAt(LocalDateTime.now());
        return customer;
    }
}
