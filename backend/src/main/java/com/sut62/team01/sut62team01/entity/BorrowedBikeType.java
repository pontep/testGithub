package com.sut62.team01.sut62team01.entity;

import java.util.Collection;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * BorrowedBikeType
 */
@Entity
@Data
public class BorrowedBikeType {

    @Id
    @SequenceGenerator(name="borrowedBikeType_seq",sequenceName="borrowedBikeType_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="borrowedBikeType_seq")
    @Column(name = "BORROWED_BIKE_TYPE_ID")
    @NotNull private long id;

    @NotNull private String type;

    @OneToMany(fetch = FetchType.EAGER)
    private Collection<BorrowedBike> borrowedBikes;

    public BorrowedBikeType() {
        
    }
    public BorrowedBikeType(String type) {
        this.type = type;
    }
}