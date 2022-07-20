package com.example.hospitalmanagementapp.services;

import com.example.hospitalmanagementapp.entities.Appointment;
import com.example.hospitalmanagementapp.entities.Patient;
import com.example.hospitalmanagementapp.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService  {

    @Autowired
    PatientRepository patientRepository;

    public List<Patient> findAll(){
        return patientRepository.findAll();
    }

    public Optional<Patient> findById(Long id){
        return patientRepository.findById(id);
    }


    public Patient addPatient(Patient patient) {

//        Long id = patient.getId();
//        patient.setMatricule();
        return patientRepository.save(patient);
    }

    public Patient updatePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }


    public Patient addPatientAppointment(int matricule, Appointment apointment) {
       Patient patient = patientRepository.findByMatricule(matricule);
       patient.getAppointmentList().add(apointment);
       patientRepository.save(patient);
       return patient;
    }
}
