package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.repository.PersonRepository;
import com.example.demo.repository.StudentRepository;
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
    public void setup() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    void testInsertDataOK(){
        Student s = new Student();
        s.setFirstName("Pontep");
        s.setLastName("Thaweesup");
        s.setStudentId("B6000783");

        s = studentRepository.saveAndFlush(s);

        Optional<Student> found = studentRepository.findById(s.getId());
        assertEquals("Pontep",found.get().getFirstName());
        assertEquals("Thaweesup",found.get().getLastName());
        assertEquals("B6000783",found.get().getStudentId());
    }

    @Test
    void testFirstNameMustNotBeNull(){
        Student s = new Student();
        s.setFirstName(null);  //<---
        s.setLastName("Thaweesup");
        s.setStudentId("B6000783");

        Set<ConstraintViolation<Student>> result = validator.validate(s);

        //ต้องมี error 1 ตัวเท่านั้น
        assertEquals(1,result.size());

        //error message ถูก
        ConstraintViolation<Student> v = result.iterator().next();
        assertEquals("must not be null",v.getMessage());
        assertEquals("firstName",v.getPropertyPath().toString());
    }

    @Test
    void testFirstStudentIdMustHaveFirstCharIsBOrMOrD(){
        Student s = new Student();
        s.setFirstName("Pontep");
        s.setLastName("Thaweesup");
        //case 'A'
        s.setStudentId("A6000783");

        Set<ConstraintViolation<Student>> result = validator.validate(s);

        //ต้องมี error 1 ตัวเท่านั้น
        assertEquals(1,result.size());
        //error message ถูก
        ConstraintViolation<Student> v = result.iterator().next();
        assertEquals("must match \"[BMD]\\d{7}\"",v.getMessage());
        assertEquals("studentId",v.getPropertyPath().toString());

        //case 'C'
        s.setStudentId("C6000783");
        Set<ConstraintViolation<Student>> result2 = validator.validate(s);
        ConstraintViolation<Student> v2 = result2.iterator().next();
        assertEquals("must match \"[BMD]\\d{7}\"",v2.getMessage());
        assertEquals("studentId",v2.getPropertyPath().toString());

    }
}
