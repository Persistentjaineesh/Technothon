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

public class ChronicData {

    @Id
    @Column(name="SUBJECT_ID")
    private String subjectId;

    @Column(name="chronic_code")
    private String chronicCode;

}
