package com.example.PollingApplicationSpringBoot.Repository;

import com.example.PollingApplicationSpringBoot.Models.Account;
import com.example.PollingApplicationSpringBoot.Models.PollCreation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollCreationRepository extends JpaRepository<PollCreation, Long> {
}
