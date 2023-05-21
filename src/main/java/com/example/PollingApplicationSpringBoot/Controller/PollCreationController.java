package com.example.PollingApplicationSpringBoot.Controller;

import com.example.PollingApplicationSpringBoot.Models.PollCreation;
import com.example.PollingApplicationSpringBoot.Service.PollCreationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PollCreationController {

    @Autowired
    PollCreationService pollCreationService;

    @RequestMapping("PollCreation/polls")
    public void savePollCreation()
    {
        createPollCreation();
    }



    public void createPollCreation(){
        PollCreation pollCreation = new PollCreation();
        pollCreation.setQuestion("d");
        pollCreation.setChoice("d");
        pollCreationService.savePollCreation(pollCreation);
    }
}
