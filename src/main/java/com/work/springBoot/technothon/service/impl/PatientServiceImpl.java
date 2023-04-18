package com.work.springBoot.technothon.service.impl;

import lombok.AllArgsConstructor;

import com.work.springBoot.technothon.dto.PatientDto;
import com.work.springBoot.technothon.dto.ResponseDto;
import com.work.springBoot.technothon.entity.Patient;
import com.work.springBoot.technothon.entity.Patients;
import com.work.springBoot.technothon.repository.PatientRepository;
import com.work.springBoot.technothon.service.PatientService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository patientRepository;
    
    
    ResponseDto responseDto= new ResponseDto();

    @Override
    public ResponseDto getAllPatients(String queryLevel ) {
//        riskPatient
//               moderatePatieent
//               hoghParient
//               lowPatient
        List<Patients> input=patientRepository.findAll();
        System.out.println("patientList:-"+ input );
        
        
//        List<PatientDto>input= new ArrayList<PatientDto>();;
        List<Patients>UrgentList= new ArrayList<Patients>();;
        List<Patients>HighList= new ArrayList<Patients>();;
        List<Patients>MediumList= new ArrayList<Patients>();;
        List<Patients>LowList= new ArrayList<Patients>();;

        for(Patients x: input){
        x.setRiskCount(x.getEmergencyCount()*0.5+x.getCriticalCount()*0.5);
        if(x.getRiskCount() > 3){
        UrgentList.add(x); 
        }
        else if(x.getRiskCount() > 2 && x.getRiskCount() <= 3){
        HighList.add(x);
        }
        else if(x.getRiskCount() > 1.5 && x.getRiskCount() <= 2){
        MediumList.add(x);
        }
        else if(x.getRiskCount()>=1 && x.getRiskCount()<=1.5 ){
        LowList.add(x);
        }

        }
        
        
         responseDto.setUrgentCount( UrgentList.size());
         responseDto.setHighCount( HighList.size());
         responseDto.setMediumCount(MediumList.size());
         responseDto.setLowCount(LowList.size());

        if(queryLevel==null){
       responseDto.setDto(input);
         
        }
        else if(queryLevel.equalsIgnoreCase("Urgent")){
        responseDto.setDto(UrgentList);
         
        }
        else if(queryLevel.equalsIgnoreCase("High")){
        responseDto.setDto(HighList);
         
        }
        else if(queryLevel.equalsIgnoreCase("Medium")){
        responseDto.setDto(MediumList);
         
        }
        else if(queryLevel.equalsIgnoreCase("Low")){
        responseDto.setDto(LowList);
         
        }
        System.out.println(responseDto);
        return  responseDto;
    }

}