package com.work.springBoot.technothon.service;

import java.util.List;

import com.work.springBoot.technothon.dto.DiseaseCountDto;
import com.work.springBoot.technothon.dto.ResponseDto;

public interface PatientService {

	ResponseDto getAllPatients(String queryLevel);
	
	List<DiseaseCountDto> getDiseaseCountService();

}