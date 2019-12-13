package com.sut62.team01.sut62team01.entity;

import javax.persistence.*;
import java.util.Collection;

import lombok.Data;
import lombok.NonNull;

@Entity
@Data
@Table(name = "DEVICEPROBLEMS")
public class DeviceProblem {
    @Id
    @SequenceGenerator(name = "DEVICEPROBLEMS_SEQ", sequenceName = "DEVICEPROBLEMS_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEVICEPROBLEMS_SEQ")
    @Column(name = "DEVICEPROBLEMS_SEQ", unique = true, nullable = true)

    private @NonNull long id;

    private @NonNull String electricproblem;

    private @NonNull String plumbingproblem;
    
    private @NonNull String buildingproblem; 

    @OneToMany(fetch = FetchType.EAGER)

    private Collection<Repair> repair;

    public DeviceProblem(){}

    public DeviceProblem(String electricproblem , String plumbingproblem , String buildingproblem){
        this.electricproblem = electricproblem;
        this.plumbingproblem = plumbingproblem;
        this.buildingproblem = buildingproblem;


    }

}