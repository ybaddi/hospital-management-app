package com.example.hospitalmanagementapp.repositories;

import com.example.hospitalmanagementapp.entities.PatientFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientFolderRepository extends JpaRepository<PatientFolder,Long>  {
}
