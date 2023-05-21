package com.example.PollingApplicationSpringBoot.Controller;

import com.example.PollingApplicationSpringBoot.Models.Account;
import com.example.PollingApplicationSpringBoot.ResponseObject.GetAccountResponse;
import com.example.PollingApplicationSpringBoot.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;
    @RequestMapping("Account/register")
    public void saveAccount()
    {
        createAccount();
    }
    @RequestMapping("Account/get")
    public List<Account> getAccount ()
    {
        return accountService.getAccount();
    }

    @RequestMapping("account/get/{accountId}")
    public GetAccountResponse createAccount (@PathVariable Long accountId)
    {
        return accountService.getAccountById(accountId);
    }

    public void createAccount() {
        Account account = new Account();
        account.setUserName("Ali");
        account.setPassWord("123abc");
    }



}
