package com.work.springBoot.technothon.service;

import com.work.springBoot.technothon.dto.ResponseDto;
import com.work.springBoot.technothon.entity.Patient;

import java.util.List;

import org.springframework.stereotype.Component;

public interface PatientService {


    ResponseDto getAllPatients( );


}