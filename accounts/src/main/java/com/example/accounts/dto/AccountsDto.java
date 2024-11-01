package com.example.accounts.dto;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.Getter;

@Data
public class AccountsDto {

    private Long accountNumber;

    private String accountType;

    private String branchAddress;
}
