package com.work.springBoot.technothon.dto;

import lombok.Data;

@Data
public class PatientDto {

	private int subjectId;

	private String gender;

	private String dob;

	private String dod;

	private String dodHosp;

	private String dodSsn;

	private int expireFlag;

	private String religion;

	private String language;

	private String maritalStatus;

	private String ethnicity;

	private String diagnosis;

	private String insurance;

	private String admissionType;

	private int hadmId;

	private int criticalCount;

	private int emergencyCount;

	private double riskNumber;

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDod() {
		return dod;
	}

	public void setDod(String dod) {
		this.dod = dod;
	}

	public String getDodHosp() {
		return dodHosp;
	}

	public void setDodHosp(String dodHosp) {
		this.dodHosp = dodHosp;
	}

	public String getDodSsn() {
		return dodSsn;
	}

	public void setDodSsn(String dodSsn) {
		this.dodSsn = dodSsn;
	}

	public int getExpireFlag() {
		return expireFlag;
	}

	public void setExpireFlag(int expireFlag) {
		this.expireFlag = expireFlag;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public String getAdmissionType() {
		return admissionType;
	}

	public void setAdmissionType(String admissionType) {
		this.admissionType = admissionType;
	}

	public int getHadmId() {
		return hadmId;
	}

	public void setHadmId(int hadmId) {
		this.hadmId = hadmId;
	}

	public int getCriticalCount() {
		return criticalCount;
	}

	public void setCriticalCount(int criticalCount) {
		this.criticalCount = criticalCount;
	}

	public int getEmergencyCount() {
		return emergencyCount;
	}

	public void setEmergencyCount(int emergencyCount) {
		this.emergencyCount = emergencyCount;
	}

	public double getRiskNumber() {
		return riskNumber;
	}

	public void setRiskNumber(double riskNumber) {
		this.riskNumber = riskNumber;
	}

}