package com.example.hospitalmanagementapp.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Service
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime date;
    private int duree;

    private boolean validated;

    @OneToOne
    @JoinColumn(name="patient_id", nullable = false)
    private Patient patient;
}
