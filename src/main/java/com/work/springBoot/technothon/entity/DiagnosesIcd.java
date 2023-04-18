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
@Table(name = "diagnoses_icd")
public class DiagnosesIcd {
	@Id
	@Column(name = "ROW_ID")
	private int rowId;

	@Column(name = "SUBJECT_ID")
	private int subjectId;

	@Column(name = "HADM_ID")
	private int hamdId;

	@Column(name = "SEQ_NUM")
	private double seqNum;

	@Column(name = "ICD9_CODE")
	private int icd9Code;

}