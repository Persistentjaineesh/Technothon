package com.work.springBoot.technothon.dto;

import java.util.List;

import lombok.Data;


@Data
public class ResponseDto {
	
	private List<PatientDto> dto;
	private int urgentCount;
	private int highCount;
	private int mediumCount;
	private int lowCount;

}
