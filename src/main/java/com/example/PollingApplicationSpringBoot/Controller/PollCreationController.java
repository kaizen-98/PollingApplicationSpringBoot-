package com.example.PollingApplicationSpringBoot.Controller;

import com.example.PollingApplicationSpringBoot.Models.Account;
import com.example.PollingApplicationSpringBoot.Models.PollCreation;
import com.example.PollingApplicationSpringBoot.Service.PollCreationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PollCreationController {

    @Autowired
    PollCreationService pollCreationService;

    @RequestMapping("PollCreation/polls")
    public void savePollCreation()
    {
        createPollCreation();
    }
    @RequestMapping("PollCreation/get")
    public List<PollCreation> getPollCreation ()
    {
        return pollCreationService.getPollCreation();
    }


    public void createPollCreation(){
        PollCreation pollCreation = new PollCreation();
        pollCreation.setQuestion("What is your favorite color");
        pollCreation.setChoice("Red");
        pollCreation.setChoice("Blue");
        pollCreation.setChoice("Green");
        pollCreationService.savePollCreation(pollCreation);
    }
}
