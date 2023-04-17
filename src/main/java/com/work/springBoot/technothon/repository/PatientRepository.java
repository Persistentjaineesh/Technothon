package com.work.springBoot.technothon.repository;

import com.work.springBoot.technothon.entity.ChronicData;
import com.work.springBoot.technothon.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    @Query(nativeQuery = true, value = "SELECT \n" +
            "   SUBJECT_ID, COUNT(SUBJECT_ID) as emergency_count\n" +
            "FROM\n" +
            "    technothon.admissions\n" +
            "WHERE\n" +
            "    admission_type = 'EMERGENCY'\n" +
            "        AND SUBJECT_ID IN (SELECT DISTINCT\n" +
            "            (SUBJECT_ID)\n" +
            "        FROM\n" +
            "            technothon.admissions)\n" +
            "            GROUP BY SUBJECT_ID;")
    List<Patient> listOfPatientEmergencyCount();


//    @Query(nativeQuery=true,value="SELECT SUBJECT_ID, COUNT(SUBJECT_ID) " +
//            "FROM technothon.diagnoses_icd d inner join technothon.chronic_code cc on d.ICD9_CODE=cc.code \n" +
//            "WHERE SUBJECT_ID IN (SELECT DISTINCT(SUBJECT_ID)FROM technothon.diagnoses_icd );")
//    List<ChronicData>listOfChronic();

}