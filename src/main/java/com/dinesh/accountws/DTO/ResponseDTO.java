package com.dinesh.accountws.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
// Data does not create a constructor.
public class ResponseDTO {
    private String statusCode;
    private String statusMsg;
}
