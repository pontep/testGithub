package com.sut62.team01.sut62team01.controller;

import com.sut62.team01.sut62team01.entity.BorrowedBike;
import com.sut62.team01.sut62team01.repository.BorrowedBikeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BorrowedBikeController
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "localhost:8080")
public class BorrowedBikeController {
    
    @Autowired
    BorrowedBikeRepository borrowedBikeRepository;

    @GetMapping("/getAllBorrowedBikes")
    public Iterable<BorrowedBike> getAllBorrowedBikes(){
        return borrowedBikeRepository.findAll();
    }
}