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

    @Id
    @Column(name="SUBJECT_ID")
    private String subjectId;

    @Column(name="emergency_count")
    private int eCount;

//    @Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)
//
// private Long SUBJECT_ID;
//
// @Column(nullable = false)
//
// private String GENDER;

// @Column(nullable = false)
//
// private String DOB;
//
//  @Column(nullable = false)
//
// private String DOD;
//
// @Column(nullable = false)
//
// private String DOD_HOSP;
//
// @Column(nullable = false)
//
// private String DOD_SSN;
//  @Column(nullable = false)
//    private String EXPIRE_FLAG;
//
//    private String HADM_ID;
//  @Column(nullable = false)
// private String INSURANCE;
// @Column(nullable = false)
// private String LANGUAGE;
// @Column(nullable = false)
//  private String RELIGION;
//  @Column(nullable = false)
// private String RISK_SCORE;

}