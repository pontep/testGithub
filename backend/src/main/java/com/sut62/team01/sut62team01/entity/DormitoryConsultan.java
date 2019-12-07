package com.sut62.team01.sut62team01.entity;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import java.util.Collection;

import javax.persistence.*;

/**
 * DormitoryConsultan
 */
public class DormitoryConsultan {

    @Id
    @SequenceGenerator(name="dorm_seq",sequenceName="dorm_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="dorm_seq")
    @Column(name = "DORM_ID")
    @NotNull private long id;

    private String name;
    private String username;
    private String password;

    @OneToMany(fetch = FetchType.EAGER)
    private Collection<BorrowedBike> borrowedBikes;

    public DormitoryConsultan() {
 
    }
    public DormitoryConsultan(String name, String username, String password) {
       this.name = name;
       this.username = username;
       this.password = password;
    }
}