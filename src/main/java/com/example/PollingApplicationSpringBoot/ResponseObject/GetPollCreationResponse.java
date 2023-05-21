package com.example.PollingApplicationSpringBoot.ResponseObject;

import com.example.PollingApplicationSpringBoot.Models.Account;
import com.example.PollingApplicationSpringBoot.Models.PollCreation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetPollCreationResponse {
    String question;
    String choice;
    public GetPollCreationResponse (String success, PollCreation pollCreation){

    }
}
