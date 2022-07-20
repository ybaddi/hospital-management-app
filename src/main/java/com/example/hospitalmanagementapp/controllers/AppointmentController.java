package com.example.hospitalmanagementapp.controllers;

import com.example.hospitalmanagementapp.entities.Appointment;
import com.example.hospitalmanagementapp.entities.Patient;
import com.example.hospitalmanagementapp.services.AppointmentService;
import com.example.hospitalmanagementapp.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;

    @GetMapping("/appointments")
    public List<Appointment> readPatients(){
        return appointmentService.findAll();
    }

    @PostMapping("/appointments")
    public Appointment addPatient(@RequestBody Appointment appointment){
        System.out.println("create");
        return appointmentService.addAppointment(appointment);
    }

    @PutMapping("/appointments")
    public Appointment updatePatient(@RequestBody Appointment appointment){
        // TODO test if juste the patient has an id
        // move to the service to be validated
        if(appointmentService.findById(appointment.getId()).isPresent())
            // TODO
            return appointmentService.updateAppointment(appointment);
        return appointment;
    }

    @DeleteMapping("appointments/{id}")
    public void deletePatient(@PathVariable Long id){
        if(appointmentService.findById(id).isPresent())
            // TODO
            appointmentService.deleteAppointment(id);
    }
}
