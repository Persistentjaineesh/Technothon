package com.work.springBoot.technothon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.work.springBoot.technothon.dto.DiseaseCountDto;
import com.work.springBoot.technothon.entity.Patients;

@Repository
public interface PatientRepository extends JpaRepository<Patients, Long> {
	
	@Query (nativeQuery = true, value = "select Disease as disease,COUNT(DISTINCT SUBJECT_ID) as diseaseCount from patients\r\n"
			+ "where Disease is not null\r\n"
			+ "GROUP BY Disease")
	List<DiseaseCountDto> fetchDiseaseCount();

}