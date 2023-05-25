package com.example.PollingApplicationSpringBoot.Repository;
import com.example.PollingApplicationSpringBoot.Models.PollVoting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollVotingRepository extends JpaRepository<PollVoting, Long>{
}
