package com.cg.mra.service;

import com.cg.mra.entities.Account;

public interface AccountService {

    Account getAccountDetails(String mobileNo);

    int rechargeAccount(String mobileNo,double rechargeAmount);
}
