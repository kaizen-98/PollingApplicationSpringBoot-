package com.example.PollingApplicationSpringBoot.Service;

import com.example.PollingApplicationSpringBoot.Models.PollVoting;
import com.example.PollingApplicationSpringBoot.Repository.PollVotingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PollVotingService {

    public List<PollVoting> getPollVoting(){ return pollVotingRepository.findAll();}
    @Autowired
    PollVotingRepository pollVotingRepository;
}
