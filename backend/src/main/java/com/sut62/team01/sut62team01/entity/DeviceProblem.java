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

    private @NonNull String problem;

    @OneToMany(fetch = FetchType.EAGER)

    private Collection<Repair> repair;

}