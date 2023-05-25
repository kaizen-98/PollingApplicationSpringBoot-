package com.example.PollingApplicationSpringBoot.ResponseObject;

import com.example.PollingApplicationSpringBoot.Models.PollVoting;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetPollVotingResponse {
    String choice1;
    String choice2;
    String choice3;
    String choice4;

    public GetPollVotingResponse (String success, PollVoting pollVoting ){

    }
}
