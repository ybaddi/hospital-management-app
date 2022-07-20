package com.example.hospitalmanagementapp.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

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

}
