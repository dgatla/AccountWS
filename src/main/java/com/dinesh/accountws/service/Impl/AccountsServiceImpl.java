package com.dinesh.accountws.service.Impl;

import com.dinesh.accountws.exception.CustomerAlreadyExistsException;
import com.dinesh.accountws.exception.CustomerNotFoundException;
import com.dinesh.accountws.mapper.CustomerMapper;
import com.dinesh.accountws.models.Account;
import com.dinesh.accountws.models.Customer;
import com.dinesh.accountws.service.IAccountsService;
import com.dinesh.accountws.DTO.CustomerDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.dinesh.accountws.repository.*;
import java.time.LocalDateTime;
import java.util.Optional;


@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountRepository accountsRepository;
    private CustomerRepository customerRepository;
    @Override
    public void createAccount(CustomerDTO customerDTO) {
        Customer customer = CustomerMapper.mapToCustomer(customerDTO, new Customer());
        Optional<Customer> optionalCustomer = customerRepository.findByMobileNumber(customerDTO.getMobileNumber());
        if (optionalCustomer.isPresent()) {
            throw new CustomerAlreadyExistsException("Customer already exists with mobile number " + customerDTO.getMobileNumber());
        }
        System.out.println(customer);
        Customer savedCustomer = customerRepository.save(customer);
        Account account = createNewAccount(savedCustomer);
        accountsRepository.save(account);
    }

    @Override
    public CustomerDTO getAccountDetails(String mobileNumber) {
        Optional<Customer> optionalCustomer = customerRepository.findByMobileNumber(mobileNumber);
        if (optionalCustomer.isEmpty()) {
            throw new CustomerNotFoundException("Customer not found with mobile number: " + mobileNumber);
        }
        return CustomerMapper.mapToCustomerDTO(optionalCustomer.get(), new CustomerDTO());
    }

    private Account createNewAccount(Customer customer) {
        Account account = new Account();
        account.setCustomerId(customer.getCustomerId());
        long randomAccountNumber = (long) Math.floor(Math.random() * 1000000000000L);
        account.setAccountNumber(randomAccountNumber);
        account.setAccountType("Savings");
        account.setBranchAddress("123 Main Street, New York");
        account.setCreatedBy("Automatic");
        account.setCreatedAt(LocalDateTime.now());
        account.setUpdatedBy("Automatic");
        account.setUpdatedAt(LocalDateTime.now());
        return account;
    }
}