package com.work.springBoot.technothon.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "admissions")

public class Admissions {

	@Column(name = "ROW_ID")
	private int rowId;

	@Column(name = "SUBJECT_ID")
	private int subjectId;

	@Id
	@Column(name = "HADM_ID")
	private int hadmId;

	@Column(name = "ADMITTIME")
	private String admitTime;

	@Column(name = "DISCHTIME")
	private String dischTime;

	@Column(name = "DEATHTIME")
	private String deathTime;

	@Column(name = "ADMISSION_TYPE")
	private String admissionType;

	@Column(name = "ADMISSION_LOCATION")
	private String admissionLocation;

	@Column(name = "DISCHARGE_LOCATION")
	private String dischargeLocation;

	@Column(name = "INSURANCE")
	private String insurance;

	@Column(name = "LANGUAGE")
	private String language;

	@Column(name = "RELIGION")
	private String religion;

	@Column(name = "MARITAL_STATUS")
	private String maritalStatus;

	@Column(name = "ETHNICITY")
	private String ethnicity;

	@Column(name = "EDREGTIME")
	private String edregTime;

	@Column(name = "EDOUTTIME")
	private String edoutTime;

	@Column(name = "DIAGNOSIS")
	private String diagnosis;

	@Column(name = "HOSPITAL_EXPIRE_FLAG")
	private int hospitalExpireFlag;

	@Column(name = "HAS_CHARTEVENTS_DATA")
	private int hasCharteventsData;

}
