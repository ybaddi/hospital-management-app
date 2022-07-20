package com.example.hospitalmanagementapp.entities;

import javax.persistence.*;

@Entity
@Table(name="patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    private String firstName;
    private String secondName;
    private String email;
    private String gender;
}
