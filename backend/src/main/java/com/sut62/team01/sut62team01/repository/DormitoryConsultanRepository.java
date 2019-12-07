package com.sut62.team01.sut62team01.repository;

import com.sut62.team01.sut62team01.entity.DormitoryConsultan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DormitoryConsultanRepository extends JpaRepository<DormitoryConsultan, Long> {

}