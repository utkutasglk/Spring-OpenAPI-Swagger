package com.example.accounts.service;

import com.example.accounts.dto.CustomerDto;
import com.example.accounts.entity.Customer;

public interface  IAccountsService {

    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);
}
