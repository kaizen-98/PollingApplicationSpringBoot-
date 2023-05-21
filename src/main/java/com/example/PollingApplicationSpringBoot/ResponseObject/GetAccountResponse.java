package com.example.PollingApplicationSpringBoot.ResponseObject;

import com.example.PollingApplicationSpringBoot.Models.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetAccountResponse {
    String UserName;
    String PassWord;

    public GetAccountResponse(String success, Account account) {

    }
}
