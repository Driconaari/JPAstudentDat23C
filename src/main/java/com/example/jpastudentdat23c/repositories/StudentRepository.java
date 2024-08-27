package com.example.jpastudentdat23c.repositories;

import com.example.jpastudentdat23c.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
