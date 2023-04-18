package com.work.springBoot.technothon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.work.springBoot.technothon.entity.Patients;

@Repository
public interface PatientRepository extends JpaRepository<Patients, Long> {

}