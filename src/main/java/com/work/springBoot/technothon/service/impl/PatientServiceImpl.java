package com.work.springBoot.technothon.service.impl;

import lombok.AllArgsConstructor;

import com.work.springBoot.technothon.dto.PatientDto;
import com.work.springBoot.technothon.dto.ResponseDto;
import com.work.springBoot.technothon.entity.Patient;
import com.work.springBoot.technothon.repository.PatientRepository;
import com.work.springBoot.technothon.service.PatientService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PatientServiceImpl implements PatientService {
    
    private PatientRepository patientRepository;

    @Override
    public ResponseDto getAllPatients( ) {
//        riskPatient
//               moderatePatieent
//               hoghParient
//               lowPatient
        List<Patient> patientList=patientRepository.listOfPatient();
        System.out.println("patientList:-"+ patientList );
        
        
        List<PatientDto>input= new ArrayList<PatientDto>();;
        List<PatientDto>UrgentList= new ArrayList<PatientDto>();;
        List<PatientDto>HighList= new ArrayList<PatientDto>();;
        List<PatientDto>MediumList= new ArrayList<PatientDto>();;
        List<PatientDto>LowList= new ArrayList<PatientDto>();;

        for(PatientDto x: input){
        x.setRiskNumber(x.getEmergencyCount()*0.5+x.getCriticalCount()*0.5);
        if(x.getRiskNumber() > 3){
        UrgentList.add(x); 
        }
        else if(x.getRiskNumber() > 2 && x.getRiskNumber() <= 3){
        HighList.add(x);
        }
        else if(x.getRiskNumber() > 1.5 && x.getRiskNumber() <= 2){
        MediumList.add(x);
        }
        else if(x.getRiskNumber()>=1 && x.getRiskNumber()<=1.5 ){
        LowList.add(x);
        }

        }
        ResponseDto responseDto;
         responseDto.setUrgentCount( UrgentList.size());
         responseDto.setHighCount( HighList.size());
         responseDto.setMediumCount(MediumList.size());
         responseDto.setLowCount(LowList.size());

//        if(queryLevel==null){
       responseDto.setPatientDto(input);
//         
//        }
//        else if(queryLevel.equalsIgnoreCase("Urgent")){
//        responseDto.setPatientDto(UrgentList);
//         
//        }
//        else if(queryLevel.equalsIgnoreCase("High")){
//        responseDto.setPatientDto(HighList);
//         
//        }
//        else if(queryLevel.equalsIgnoreCase("Medium")){
//        responseDto.setPatientDto(MediumList);
//         
//        }
//        else if(queryLevel.equalsIgnoreCase("Low")){
//        responseDto.setPatientDto(LowList);
//         
//        }
        System.out.println(responseDto);
        return  responseDto;
    }

}