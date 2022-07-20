package com.example.hospitalmanagementapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class PatientFolder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

//    private List<String> medicament;
//    private List<String> maladie;
//    private List<String> documents;

}
