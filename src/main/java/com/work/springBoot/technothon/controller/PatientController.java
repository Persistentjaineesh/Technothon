package com.work.springBoot.technothon.controller;

import lombok.AllArgsConstructor;

import com.work.springBoot.technothon.dto.ResponseDto;
import com.work.springBoot.technothon.entity.Patient;
import com.work.springBoot.technothon.service.PatientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor

public class PatientController {
    @Autowired
    private PatientService patientService;


    // Build Get All Users REST API
    // http://localhost:8080/Patients
    @GetMapping("/patients")
    public ResponseEntity<ResponseDto> getAllPatients( ){
        //ek query parameter rhega Level
//         ""=sb list bhejna
//         "risk"=risk EQUATIOn for risk anf further
        ResponseDto output = patientService.getAllPatients( );
        return new ResponseEntity<>(output, HttpStatus.OK);
    }

}