package com.example.hospitalmanagementapp.entities;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.security.MessageDigest;
import java.util.Set;

@Entity
@Table(name="patient")
@Getter
@Setter
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;


    private int matricule;
    private String firstName;
    private String secondName;
    private String email;
    private String gender;

    @OneToMany()
    private Set<Appointment> appointmentList;

    @OneToOne
    @JoinColumn(name="patientFolder_id", nullable = true)
    private PatientFolder patientFolder;

    @PrePersist
    public void generateMatericule(){
            matricule =  this.hashCode();
    }

}
