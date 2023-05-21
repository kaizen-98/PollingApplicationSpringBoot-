package com.example.PollingApplicationSpringBoot.RequestObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetPollCreationRequestObject {
    String question;
    String choice;
}
