package com.example.hospitalmanagementapp.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalDate date;
    private int duree;

    private boolean validated;

    @OneToOne
    @JoinColumn(name="patient_id", nullable = false)
    private Patient patient;
}
