package com.example.PollingApplicationSpringBoot.RequestObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetPollVotingRequestObject {
    String choice1;
    String choice2;
    String choice3;
    String choice4;
}
