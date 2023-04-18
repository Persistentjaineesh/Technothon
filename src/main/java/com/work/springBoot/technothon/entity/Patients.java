package com.work.springBoot.technothon.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patients")
public class Patients {

	@Column(name="ROW_ID")
    private int rowId;
	
    @Id
    @Column(name="SUBJECT_ID")
    private int subjectId;

    @Column(name="GENDER")
    private String gender;
    
    @Column(name="DOB")
    private String dob;
    
    @Column(name="DOD")
    private String dod;
    
    @Column(name="DOD_HOSP")
    private String dodHosp;
    
    @Column(name="DOD_SSN")
    private String dodSsn;
    
    @Column(name="EXPIRE_FLAG")
    private int expireFlag;
    
    @Column(name="INSURANCE")
    private String insurance;
    
    @Column(name="LANGUAGE")
    private String language;
    
    @Column(name="RELIGION")
    private String religion;
    
    @Column(name="MARITAL_STATUS")
    private String maritalStatus;
    
    @Column(name="ETHNICITY")
    private String ethnicity;
    
    @Column(name="DIAGNOSIS")
    private String diagnosis;
    
    @Column(name="HADM_ID")
    private int hadmId;
    
    @Column(name="ADMISSION_TYPE")
    private String admissionType;
    
    @Column(name="critical_count")
    private Double criticalCount;
    
    @Column(name="emergency_count")
    private Double emergencyCount;
    
    private Double riskCount;
    
    public int getRowId() {
		return rowId;
	}

	public void setRowId(int rowId) {
		this.rowId = rowId;
	}

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

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public Double getRiskCount() {
		return riskCount;
	}

	public void setRiskCount(Double riskCount) {
		this.riskCount = riskCount;
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

	public int getHadmId() {
		return hadmId;
	}

	public void setHadmId(int hadmId) {
		this.hadmId = hadmId;
	}

	public String getAdmissionType() {
		return admissionType;
	}

	public void setAdmissionType(String admissionType) {
		this.admissionType = admissionType;
	}

	public Double getCriticalCount() {
		return criticalCount;
	}

	public void setCriticalCount(Double criticalCount) {
		this.criticalCount = criticalCount;
	}

	public Double getEmergencyCount() {
		return emergencyCount;
	}

	public void setEmergencyCount(Double emergencyCount) {
		this.emergencyCount = emergencyCount;
	}

	

}