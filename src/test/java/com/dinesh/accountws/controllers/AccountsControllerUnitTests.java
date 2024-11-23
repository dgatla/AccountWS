package com.dinesh.accountws.controllers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.dinesh.accountws.DTO.CustomerDTO;
import com.dinesh.accountws.service.IAccountsService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AccountsControllerUnitTests {

    @Mock
    private IAccountsService iAccountsService;

    @InjectMocks
    private AccountsController accountsController;

    @Test
    void getAccountDetails_ValidMobileNumber_ReturnsCustomerDTO() {
        String mobileNumber = "1234567890";
        CustomerDTO expectedCustomerDTO = new CustomerDTO();
        when(iAccountsService.getAccountDetails(mobileNumber)).thenReturn(expectedCustomerDTO);

        ResponseEntity<CustomerDTO> response = accountsController.getAccountDetails(mobileNumber);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(expectedCustomerDTO, response.getBody());
        verify(iAccountsService, times(1)).getAccountDetails(mobileNumber);
    }

    @Test
    void getAccountDetails_EmptyMobileNumber_ReturnsCustomerDTO() {
        String mobileNumber = "";
        CustomerDTO expectedCustomerDTO = new CustomerDTO();
        when(iAccountsService.getAccountDetails(mobileNumber)).thenReturn(expectedCustomerDTO);

        ResponseEntity<CustomerDTO> response = accountsController.getAccountDetails(mobileNumber);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(expectedCustomerDTO, response.getBody());
        verify(iAccountsService, times(1)).getAccountDetails(mobileNumber);
    }

    @Test
    void getAccountDetails_NullMobileNumber_ReturnsCustomerDTO() {
        String mobileNumber = null;
        CustomerDTO expectedCustomerDTO = new CustomerDTO();
        when(iAccountsService.getAccountDetails(mobileNumber)).thenReturn(expectedCustomerDTO);

        ResponseEntity<CustomerDTO> response = accountsController.getAccountDetails(mobileNumber);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(expectedCustomerDTO, response.getBody());
        verify(iAccountsService, times(1)).getAccountDetails(mobileNumber);
    }

    @Test
    void getAccountDetails_ServiceReturnsNull_ReturnsOkWithNullBody() {
        String mobileNumber = "1234567890";
        when(iAccountsService.getAccountDetails(mobileNumber)).thenReturn(null);

        ResponseEntity<CustomerDTO> response = accountsController.getAccountDetails(mobileNumber);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNull(response.getBody());
        verify(iAccountsService, times(1)).getAccountDetails(mobileNumber);
    }
}
