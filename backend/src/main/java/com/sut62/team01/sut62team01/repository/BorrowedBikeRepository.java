package com.sut62.team01.sut62team01.repository;

import com.sut62.team01.sut62team01.entity.BorrowedBike;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * BorrowedBikeRepository
 */
@RepositoryRestResource
public interface BorrowedBikeRepository extends JpaRepository<BorrowedBike, Long>{

}