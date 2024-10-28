package com.dinesh.accountws.DTO;

import lombok.Data;

//@Getter
//@Setter
//@ToString

@Data
// Data creates getter and setter for all the fields and it also creates hashcode and equals method.
// For models we did not specify the Data because generating equals, hashcode can cause some problems with JPA.
public class AccountsDTO {
    private long accountNumber;
    private String accountType;
    private String branchAddress;
}
