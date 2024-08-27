package com.example.jpastudentdat23c.controller;

import com.example.jpastudentdat23c.model.Student;
import com.example.jpastudentdat23c.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class StudentRestController {

@Autowired

private StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> students() {
        return studentRepository.findAll();
    }
}
