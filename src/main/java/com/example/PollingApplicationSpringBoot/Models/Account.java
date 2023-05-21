package com.example.PollingApplicationSpringBoot.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.awt.dnd.DragSourceDragEvent;

@Getter
@Setter
@Entity
@Data
public class Account extends BaseEntity{

    @Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String UserName;
    String PassWord;


}
