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

}