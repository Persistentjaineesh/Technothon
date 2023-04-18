package com.work.springBoot.technothon.service;

import com.work.springBoot.technothon.dto.ResponseDto;

public interface PatientService {

	ResponseDto getAllPatients(String queryLevel);

}