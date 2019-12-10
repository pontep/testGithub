package com.sut62.team01.sut62team01.entity;

import javax.persistence.*;
import java.util.Collection;

import lombok.Data;
import lombok.NonNull;
@Entity
@Data
@Table(name = "DEVICETYPE")
public class DeviceType{
    @Id
    @SequenceGenerator(name="DEVICETYPE_SEQ",sequenceName = "DEVICETYPE_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEVICETYPE_SEQ")
    @Column(name="DEVICETYPE_ID",unique = true, nullable = true)

    private @NonNull long id;

    private @NonNull String electrictype;

    private @NonNull String plumbingtype;

    private @NonNull String buildingstype;


    @OneToMany(fetch = FetchType.EAGER)
    
    private Collection<Repair> repair;


}