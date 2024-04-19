package com.springapi.main.student;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController()
public class StudentController {
  private final StudentService studentService;

  public StudentController(StudentServiceImp studentService) {
    this.studentService = studentService;
  }

  @PostMapping("/student")
  @ResponseStatus(HttpStatus.CREATED)
  public StudentResponseDTO addStudent(@RequestBody StudentDTO studentDTO) {
    return studentService.save(studentDTO);
  }

  @GetMapping("/students")
  @ResponseStatus(HttpStatus.OK)
  public List<StudentResponseDTO> getAllStudents() {
    return studentService.findAll();
  }

  @GetMapping("/student/{id}")
  @ResponseStatus(HttpStatus.OK)
  public StudentResponseDTO getStudent(@PathVariable String id) {
    return studentService.findById(id);
  }

}
