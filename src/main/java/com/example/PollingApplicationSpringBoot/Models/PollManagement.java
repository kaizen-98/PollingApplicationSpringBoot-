package com.example.PollingApplicationSpringBoot.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Data
public class PollManagement extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @JoinColumn(name = "Account_id", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    Account account;

    @JoinColumn(name = "poll_id", referencedColumnName = "id")
    @OneToMany(cascade = CascadeType.ALL)
    List<PollCreation> polls;
}
