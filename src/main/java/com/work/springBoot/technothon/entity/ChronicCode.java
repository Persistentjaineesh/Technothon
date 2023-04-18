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
@Table(name = "chronic_code")
public class ChronicCode {
	
	  @Id
	    @Column(name="code")
	    private String code;

     
    @Column(name="Disease")
    private String disease;
    
  
}