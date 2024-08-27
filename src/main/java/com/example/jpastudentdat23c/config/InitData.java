package com.example.jpastudentdat23c.config;


import com.example.jpastudentdat23c.model.Student;
import com.example.jpastudentdat23c.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        s1.setName("John");
        s1.setBornDate(LocalDate.of(2000, 1, 12));
        s1.setBornTime(LocalTime.of(10, 11, 12));
        studentRepository.save(s1);
    }
}
