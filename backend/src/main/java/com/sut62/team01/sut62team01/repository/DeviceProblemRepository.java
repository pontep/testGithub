package com.sut62.team01.sut62team01.repository;

import com.sut62.team01.sut62team01.entity.DeviceProblem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DeviceProblemRepository extends JpaRepository<DeviceProblem, Long> {
    DeviceProblem findById(long id);
}