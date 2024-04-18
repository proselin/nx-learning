package com.springapi.main.controllers;

import com.springapi.main.entities.Student;
import com.springapi.main.repositories.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController()
public class StudentController {
  private StudentRepository studentRepository;

  public StudentController(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  @PostMapping("/student")
  @ResponseStatus(HttpStatus.CREATED)
  public Student addStudent(@RequestBody Student student) {
    return studentRepository.save(student);
  }

  @GetMapping("/students")
  @ResponseStatus(HttpStatus.OK)
  public List<Student> getAllStudents(
    @RequestParam(
      required = false
    ) Integer ageAfter
  ) {
    if(ageAfter != null) {
      return studentRepository.findStudentsByAgeBefore(ageAfter);
    }
    return studentRepository.findAll();
  }

  @GetMapping("/student/{id}")
  @ResponseStatus(HttpStatus.OK)
  public Student getStudent(@PathVariable String id) {
    return studentRepository.findById(UUID.fromString(id)).orElseThrow();
  }

}
