package com.work.springBoot.technothon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.work.springBoot.technothon.entity.Patients;

@Repository
public interface PatientRepository extends JpaRepository<Patients, Long> {
	
	@Query (nativeQuery = true, value = "select DISTINCT ( concat( SUBJECT_ID,Disease)) as subjectDisease,SUBJECT_ID,Disease, ROW_ID,GENDER, DOB, DOD, DOD_HOSP, \r\n"
			+ "DOD_SSN, EXPIRE_FLAG, RELIGION, \r\n"
			+ "LANGUAGE, MARITAL_STATUS, ETHNICITY, DIAGNOSIS, \r\n"
			+ "INSURANCE, ADMISSION_TYPE, HADM_ID, critical_count, emergency_count, \r\n"
			+ "ICD9_CODE, risk_count\r\n"
			+ "from patients\r\n"
			+ "group by subjectDisease")
	List<Patients> fetchUniqueRows();

}