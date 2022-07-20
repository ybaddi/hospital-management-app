package com.example.hospitalmanagementapp.services;

import com.example.hospitalmanagementapp.entities.Appointment;
import com.example.hospitalmanagementapp.entities.Patient;
import com.example.hospitalmanagementapp.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospitalmanagementapp.repositories.AppointmentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService  {

    @Autowired
    AppointmentRepository appointmentRepository;


    public List<Appointment> findAll(){
        return appointmentRepository.findAll();
    }

    public Optional<Appointment> findById(Long id){
        return appointmentRepository.findById(id);
    }


    public Appointment addAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public Appointment updateAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }
}
