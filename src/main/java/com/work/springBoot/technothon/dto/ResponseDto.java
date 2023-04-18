package com.work.springBoot.technothon.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.work.springBoot.technothon.entity.Patients;

import lombok.Data;

//@Component

@Data
public class ResponseDto {
	
	private List<Patients> dto;
	private int urgentCount;
	private int highCount;
	private int mediumCount;
	private int lowCount;
	
	public List<Patients> getDto() {
		return dto;
	}
	public void setDto(List<Patients> dto) {
		this.dto = dto;
	}
	public int getUrgentCount() {
		return urgentCount;
	}
	public void setUrgentCount(int urgentCount) {
		this.urgentCount = urgentCount;
	}
	public int getHighCount() {
		return highCount;
	}
	public void setHighCount(int highCount) {
		this.highCount = highCount;
	}
	public int getMediumCount() {
		return mediumCount;
	}
	public void setMediumCount(int mediumCount) {
		this.mediumCount = mediumCount;
	}
	public int getLowCount() {
		return lowCount;
	}
	public void setLowCount(int lowCount) {
		this.lowCount = lowCount;
	}
	

}
