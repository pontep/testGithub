package com.din.dinentity.entity;

import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * Student
 */
@Entity
@Data
@NoArgsConstructor
public class Student {

    @Id
    @Column(name = "STUDENT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull private Long id;

    @NotBlank
    @Column(name = "username",unique = true)
    @NonNull private String username;

    @Column(name = "password")
    @NotBlank
    @NonNull private String password;

    // @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    // private Set<BorrowedBike> borrowedBikes;
}