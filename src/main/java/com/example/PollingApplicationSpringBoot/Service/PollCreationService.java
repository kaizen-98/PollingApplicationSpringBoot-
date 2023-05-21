package com.example.PollingApplicationSpringBoot.Service;


import com.example.PollingApplicationSpringBoot.Models.PollCreation;
import com.example.PollingApplicationSpringBoot.Repository.PollCreationRepository;
import com.example.PollingApplicationSpringBoot.ResponseObject.GetPollCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PollCreationService {
    public List<PollCreation> getPollCreation() {
        return pollCreationRepository.findAll();
    }
    @Autowired
    PollCreationRepository pollCreationRepository;

    public void savePollCreation(PollCreation pollCreation) {
        pollCreationRepository.save( pollCreation);
    }

    public GetPollCreationResponse getPollCreationById(Long PollCreationId){
        Optional<PollCreation> optionalPollCreation = pollCreationRepository.findById(PollCreationId);
        if (!optionalPollCreation .isEmpty()) {
            PollCreation PollCreation = optionalPollCreation.get();
            GetPollCreationResponse pollCreationResponse = new  GetPollCreationResponse(PollCreation.getQuestion(),PollCreation.getChoice());
            return pollCreationResponse;
        } else {
            return null;
        }
    }
}
