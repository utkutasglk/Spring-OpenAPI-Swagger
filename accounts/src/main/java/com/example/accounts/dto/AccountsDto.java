package com.example.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @NotEmpty(message = "AccountNumber can not be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "AccountNumber must be 10 digits")
    @Schema(
            description = "Account Number of  account", example = "3454433243"
    )
    private Long accountNumber;

    @NotEmpty(message = "AccountType can not be null or empty")
    @Schema(
            description = "Account type of account", example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "BranchAddress can not be null or empty")
    @Schema(
            description = "Account branch address", example = "123 NewYork"
    )
    private String branchAddress;
}
