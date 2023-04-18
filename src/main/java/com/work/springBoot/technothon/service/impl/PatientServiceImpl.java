package com.work.springBoot.technothon.service.impl;

import lombok.AllArgsConstructor;
import com.work.springBoot.technothon.entity.Patient;
import com.work.springBoot.technothon.repository.PatientRepository;
import com.work.springBoot.technothon.service.PatientService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;

    @Override
    public List<Patient> getAllPatients( ) {
//        riskPatient
//               moderatePatieent
//               hoghParient
//               lowPatient
        List<Patient> patientList=patientRepository.listOfPatientEmergencyCount();
        System.out.println("patientList:-"+ patientList );
//        if(queryparam ==null){
//            return patientList;
//        }
//        for() {
//            if (a + b >= 10) {
//                riskpatient +=
//            } else if (){
//
//            }
//                eseif(){
//
//            }
//            elseif(){
//        }

        return patientList;
    }

}