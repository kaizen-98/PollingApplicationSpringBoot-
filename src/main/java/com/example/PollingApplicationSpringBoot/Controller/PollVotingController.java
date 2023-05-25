package com.example.PollingApplicationSpringBoot.Controller;

import com.example.PollingApplicationSpringBoot.Models.PollCreation;
import com.example.PollingApplicationSpringBoot.Models.PollVoting;
import com.example.PollingApplicationSpringBoot.ResponseObject.GetPollCreationResponse;
import com.example.PollingApplicationSpringBoot.ResponseObject.GetPollVotingResponse;
import com.example.PollingApplicationSpringBoot.Service.PollVotingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PollVotingController {

    @Autowired
    PollVotingService  pollVotingService;

    @RequestMapping("PollVoting/vote")
    public void savePollVoting(){
        createPollVoting();
    }
    @RequestMapping("PollVoting/get")
    public List<PollVoting> getPollVoting ()
    {
        return pollVotingService.getPollVoting();
    }

    @RequestMapping("pollVoting/get/{PollVotingId}")
    public GetPollVotingResponse createPollVoting (@PathVariable Long pollVotingId)
    {
        return pollVotingService.getPollVotingResponseById(pollVotingId);
    }

    public void createPollVoting(){
        PollVoting pollVoting = new PollVoting();
        pollVoting.setChoice1("Red");
        pollVoting.setChoice2("blue");
        pollVoting.setChoice3("Yellow");
        pollVoting.setChoice4("Organ");
        pollVotingService.savePollVoting(pollVoting);
    }
}
