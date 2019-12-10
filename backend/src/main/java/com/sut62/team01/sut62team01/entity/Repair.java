package com.sut62.team01.sut62team01.entity;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@Entity
@Table(name = "REPAIR")

public class Repair {
    @Id
    @SequenceGenerator(name = "REPAIR_seq", sequenceName = "REPAIR_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REPAIR_seq")
    @Column(name = "SREPAIR_ID", unique = true, nullable = true)

    private Long id;

    @Column(name = "List")
    private String  list;

    @Column(name = "Repair_Date")
    private Date repairDate;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = DeviceType.class)
    @JoinColumn(name = "DEVICETYPE_ID", insertable = true)
    private DeviceType type;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = DeviceProblem.class)
    @JoinColumn(name = "DEVICEPROBLEMS_ID", insertable = true)
    private DeviceProblem problem;
    
    
    /**
     * รอของฟร้องที่จะเชื่อม
     */

  

   

}