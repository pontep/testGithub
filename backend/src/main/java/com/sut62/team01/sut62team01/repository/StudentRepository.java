package com.sut62.team01.sut62team01.repository;

import com.sut62.team01.sut62team01.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
