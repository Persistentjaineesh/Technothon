package com.work.springBoot.technothon.repository;
import com.work.springBoot.technothon.entity.ChronicData;
import com.work.springBoot.technothon.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChronicDataRepository extends JpaRepository<ChronicData, Long>{
    @Query(nativeQuery=true,value="SELECT \n" +
            " SUBJECT_ID, COUNT(SUBJECT_ID) AS critical_count\n" +
            "FROM\n" +
            " technothon.diagnoses_icd d\n" +
            " INNER JOIN\n" +
            " technothon.chronic_code c \n" +
            " on d.ICD9_CODE=c.ICD9_CODE\n" +
            " WHERE\n" +
            " SUBJECT_ID IN (\n" +
            " SELECT SUBJECT_ID \n" +
            " FROM technothon.diagnoses_icd)\n" +
            " group by SUBJECT_ID;")
    List<ChronicData> listOfPatientChronicCount();
}
