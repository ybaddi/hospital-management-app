package com.example.hospitalmanagementapp.repositories;

import com.example.hospitalmanagementapp.entities.Appointment;
import com.example.hospitalmanagementapp.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
public interface PatientRepository extends JpaRepository<Patient,Long>  {


    Patient findByMatricule(int matricule);

}
