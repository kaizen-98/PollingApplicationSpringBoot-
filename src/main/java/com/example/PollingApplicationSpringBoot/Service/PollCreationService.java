package com.example.PollingApplicationSpringBoot.Service;

import com.example.PollingApplicationSpringBoot.Models.Account;
import com.example.PollingApplicationSpringBoot.Models.PollCreation;
import com.example.PollingApplicationSpringBoot.Repository.PollCreationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
