package com.example.hospitalmanagementapp.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hospitalmanagementapp.repositories.PatientFolderRepository;

@Service
public class PatientfolderService {

    @Autowired
    PatientFolderRepository patientForlderRepository;
}
