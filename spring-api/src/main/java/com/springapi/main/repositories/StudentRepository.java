package com.springapi.main.repositories;

import com.springapi.main.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID> {

  List<Student> findStudentsByAgeBefore(Integer age);
}
