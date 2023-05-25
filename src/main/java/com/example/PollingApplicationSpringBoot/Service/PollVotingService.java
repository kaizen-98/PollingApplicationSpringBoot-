package com.example.PollingApplicationSpringBoot.Service;

import com.example.PollingApplicationSpringBoot.Models.PollCreation;
import com.example.PollingApplicationSpringBoot.Models.PollVoting;
import com.example.PollingApplicationSpringBoot.Repository.PollVotingRepository;
import com.example.PollingApplicationSpringBoot.ResponseObject.GetPollCreationResponse;
import com.example.PollingApplicationSpringBoot.ResponseObject.GetPollVotingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PollVotingService {

    public List<PollVoting> getPollVoting(){ return pollVotingRepository.findAll();}
    @Autowired
    PollVotingRepository pollVotingRepository;

    public void savePollVoting(PollVoting pollVoting){
        pollVotingRepository.save(pollVoting);
    }

    public GetPollVotingResponse getPollVotingResponseById(Long PollVotingId){
        Optional<PollVoting> optionalPollVoting = pollVotingRepository.findById(PollVotingId);
        if (!optionalPollVoting.isEmpty()) {
            PollVoting pollVoting = optionalPollVoting.get();
           GetPollVotingResponse pollVotingResponse = new GetPollVotingResponse(pollVoting.getChoice1(),pollVoting.getChoice2(),pollVoting.getChoice3(),pollVoting.getChoice4());
            return pollVotingResponse;
        } else {
            return null;
        }
    }

}
