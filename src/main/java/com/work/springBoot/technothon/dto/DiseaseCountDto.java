package com.work.springBoot.technothon.dto;

import lombok.Data;

@Data
public class DiseaseCountDto {
	
	private String disease;
	
	private int diseaseCount;

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getDiseaseCount() {
		return diseaseCount;
	}

	public void setDiseaseCount(int diseaseCount) {
		this.diseaseCount = diseaseCount;
	}
	
	
}
