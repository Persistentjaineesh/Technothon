package com.work.springBoot.technothon.repository;

 
import com.work.springBoot.technothon.dto.PatientDto;
import com.work.springBoot.technothon.entity.Patient;
import com.work.springBoot.technothon.entity.Patients;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PatientRepository extends JpaRepository<Patients, Long> {

}