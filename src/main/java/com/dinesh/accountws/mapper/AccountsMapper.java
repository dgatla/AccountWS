package com.dinesh.accountws.mapper;

import com.dinesh.accountws.DTO.AccountsDTO;
import com.dinesh.accountws.models.Account;

public class AccountsMapper {
    public static AccountsDTO mapToAccountsDTO(Account account, AccountsDTO accountsDTO) {
        accountsDTO.setAccountNumber(account.getAccountNumber());
        accountsDTO.setAccountType(account.getAccountType());
        accountsDTO.setBranchAddress(account.getBranchAddress());
        return accountsDTO;
    }

    public static Account mapToAccount(AccountsDTO accountsDTO, Account account) {
        account.setAccountNumber(accountsDTO.getAccountNumber());
        account.setAccountType(accountsDTO.getAccountType());
        account.setBranchAddress(accountsDTO.getBranchAddress());
        return account;
    }
}
