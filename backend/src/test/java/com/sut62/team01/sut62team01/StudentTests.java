package com.sut62.team01.sut62team01;

import com.sut62.team01.sut62team01.entity.Student;
import com.sut62.team01.sut62team01.repository.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class StudentTests {

    private Validator validator;

    @Autowired
    private StudentRepository studentRepository;

    @BeforeEach
    public void setup(){
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }

    @Test
    void testInsertStudentOK(){
        Student student = new Student();
        student.setName("Pontep Thaweesup");
        student.setStudentId("B6000783");
        student.setUsername("pontep");
        student.setPassword("123456");
        student = studentRepository.saveAndFlush(student);

        Optional<Student> found = studentRepository.findById(student.getId());
        assertEquals(student,found.get());
    }

    @Test
    void testStudentUsernameMustBeBetween4And20(){
        Student student = new Student();
        student.setName("Pontep Thaweesup");
        student.setStudentId("B6000783");
//        test username < 4
        student.setUsername("123");
        student.setPassword("123456");
//        validate
        Set<ConstraintViolation<Student>> result = validator.validate(student);
        assertEquals(1,result.size());
//        expected field and error message
        assertEquals("size must be between 4 and 20",result.iterator().next().getMessage());
        assertEquals("username",result.iterator().next().getPropertyPath().toString());

        student.setUsername("123456789012345678901");
        result = validator.validate(student);
        assertEquals(1,result.size());
        assertEquals("size must be between 4 and 20",result.iterator().next().getMessage());
        assertEquals("username",result.iterator().next().getPropertyPath().toString());

    }

}
