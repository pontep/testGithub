package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Data
@NoArgsConstructor
@Table(
   uniqueConstraints = @UniqueConstraint(columnNames = {"PERSON_ID"})
)
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Pattern(regexp = "\\d{13}")
    @Column(name = "PERSON_ID")
    private String personId;

}
