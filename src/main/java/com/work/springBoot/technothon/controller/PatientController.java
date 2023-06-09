package com.work.springBoot.technothon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.work.springBoot.technothon.dto.DiseaseCountDto;
import com.work.springBoot.technothon.dto.ResponseDto;
import com.work.springBoot.technothon.service.PatientService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@CrossOrigin

public class PatientController {
	@Autowired
	private PatientService patientService;
	

	// Build Get All Users REST API
	// http://localhost:8080/patients
	@GetMapping("/patients")

	public ResponseEntity<ResponseDto> getAllPatients(@RequestParam(required = false) String decision) {
		// Query Parameter -
		// http://localhost:8080/patients?decision=Urgent/High/Medium/Low
		ResponseDto output = patientService.getAllPatients(decision);
		return new ResponseEntity<>(output, HttpStatus.OK);
	}
	
//	@GetMapping("/diseaseCount")
//	
//	public ResponseEntity<List<DiseaseCountDto>> getDiseaseCount(){
//		
//		// http://localhost:8080/diseaseCount
//		List<DiseaseCountDto> output = patientService.getDiseaseCountService();
//				return new ResponseEntity<>(output, HttpStatus.OK);
//		
//	}

}