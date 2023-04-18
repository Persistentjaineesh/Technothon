package com.work.springBoot.technothon.repository;

 
import com.work.springBoot.technothon.dto.PatientDto;
import com.work.springBoot.technothon.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    @Query(nativeQuery = true, value = "select \r\n"
    		+ "p.SUBJECT_ID,\r\n"
    		+ "p.GENDER,\r\n"
    		+ "p.DOB,\r\n"
    		+ "p.DOD,\r\n"
    		+ "p.DOD_HOSP,\r\n"
    		+ "p.DOD_SSN,\r\n"
    		+ "p.EXPIRE_FLAG,\r\n"
    		+ "A.RELIGION,\r\n"
    		+ "A.LANGUAGE,\r\n"
    		+ "MARITAL_STATUS,\r\n"
    		+ "A.ETHNICITY,\r\n"
    		+ "A.DIAGNOSIS,\r\n"
    		+ "A.INSURANCE,\r\n"
    		+ "A.ADMISSION_TYPE,\r\n"
    		+ "A.HADM_ID,\r\n"
    		+ "criticalTable.critical_count,\r\n"
    		+ "emergencyTable.emergency_count\r\n"
    		+ "FROM\r\n"
    		+ "patient p\r\n"
    		+ "Left Join ADMISSIONS A\r\n"
    		+ "ON P.SUBJECT_ID=A.SUBJECT_ID\r\n"
    		+ "LEFT join\r\n"
    		+ "(SELECT  \r\n"
    		+ "SUBJECT_ID, COUNT(SUBJECT_ID) AS critical_count\r\n"
    		+ "FROM \r\n"
    		+ "technothon.diagnoses_icd d\r\n"
    		+ "INNER JOIN\r\n"
    		+ "technothon.chronic_code c\r\n"
    		+ "on d.ICD9_CODE=c.code\r\n"
    		+ "WHERE\r\n"
    		+ "SUBJECT_ID IN (SELECT SUBJECT_ID \r\n"
    		+ "FROM technothon.diagnoses_icd)\r\n"
    		+ "group by SUBJECT_ID) as criticalTable\r\n"
    		+ "on p.SUBJECT_ID=criticalTable.SUBJECT_ID\r\n"
    		+ "LEFT Join\r\n"
    		+ "(\r\n"
    		+ "SELECT\r\n"
    		+ "COUNT(SUBJECT_ID) AS emergency_count , SUBJECT_ID  FROM technothon.admissions\r\n"
    		+ "WHERE admission_type = 'EMERGENCY'\r\n"
    		+ "AND SUBJECT_ID IN (SELECT DISTINCT\r\n"
    		+ "(SUBJECT_ID)\r\n"
    		+ "FROM\r\n"
    		+ "technothon.admissions)\r\n"
    		+ "GROUP BY SUBJECT_ID) as emergencyTable\r\n"
    		+ "on p.SUBJECT_ID=emergencyTable.SUBJECT_ID")
    List<PatientDto> listOfPatient();

}