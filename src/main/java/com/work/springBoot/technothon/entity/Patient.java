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
@Table(name = "patient")
public class Patient {

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

}