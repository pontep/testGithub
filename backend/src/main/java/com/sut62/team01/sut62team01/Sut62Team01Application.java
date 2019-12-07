package com.sut62.team01.sut62team01;

import com.sut62.team01.sut62team01.repository.BorrowedBikeRepository;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Sut62Team01Application {

	public static void main(String[] args) {
		SpringApplication.run(Sut62Team01Application.class, args);
	}

	@Bean
	ApplicationRunner init(BorrowedBikeRepository borrowedBikeRepository) {
		return args -> {
			//inject here...
			
		};
	}

}
