package com.example.hospitalmanagementapp.controllers;

import com.example.hospitalmanagementapp.entities.Appointment;
import com.example.hospitalmanagementapp.entities.Patient;
import com.example.hospitalmanagementapp.repositories.PatientRepository;
import com.example.hospitalmanagementapp.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping("/patients")
    public List<Patient> readPatients(){
      return patientService.findAll();
    }

    @PostMapping("/patients")
    public Patient addPatient(@RequestBody Patient patient){
        System.out.println("create");
        return patientService.addPatient(patient);
    }

    @PutMapping("/patients")
    public Patient updatePatient(@RequestBody Patient patient){
        // TODO test if juste the patient has an id
        // move to the service to be validated
        if(patientService.findById(patient.getId()).isPresent())
            // TODO
            return patientService.updatePatient(patient);
        return patient;
    }

    @DeleteMapping("patients/{id}")
    public void deletePatient(@PathVariable Long id){
        if(patientService.findById(id).isPresent())
            // TODO
            patientService.deletePatient(id);
    }


    @PostMapping("/patients/{matricule}/addAppointment")
    public Patient addPatientAppointment(@PathVariable int matricule, @RequestBody Appointment apointment){
        System.out.println("create");
        return patientService.addPatientAppointment(matricule,apointment);
    }



}
