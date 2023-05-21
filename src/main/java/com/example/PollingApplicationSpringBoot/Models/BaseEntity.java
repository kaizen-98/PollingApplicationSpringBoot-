package com.example.PollingApplicationSpringBoot.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
@Data
public class BaseEntity {

Data createdDate;
Data updatedDate;
Boolean isActive;

}
