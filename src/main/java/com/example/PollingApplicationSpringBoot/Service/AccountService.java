package com.example.PollingApplicationSpringBoot.Service;

import com.example.PollingApplicationSpringBoot.Models.Account;
import com.example.PollingApplicationSpringBoot.Repository.AccountRepository;
import com.example.PollingApplicationSpringBoot.ResponseObject.GetAccountResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    public List<Account> getAccount() {
        return accountRepository.findAll();
    }
    @Autowired
    AccountRepository accountRepository;

    public void saveAccount(Account account) {
        accountRepository.save(account);
    }
    public GetAccountResponse getAccountById(Long AccountId) {
        Optional<Account> optionalAccount = accountRepository.findById(AccountId);
        if (!optionalAccount.isEmpty()) {
            Account account = optionalAccount.get();
            GetAccountResponse accountResponse = new GetAccountResponse(account.getUserName(),account.getPassWord());
            return accountResponse;
        } else {
            return null;
        }
    }
}
