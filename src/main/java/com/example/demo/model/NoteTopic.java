package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class NoteTopic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Note note;

    @ManyToOne
    private Topic topic;

}