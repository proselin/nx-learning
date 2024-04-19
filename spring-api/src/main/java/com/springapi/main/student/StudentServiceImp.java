package com.springapi.main.student;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StudentServiceImp implements StudentService {
  private final StudentMapper studentMapper;
  private final StudentRepository repository;

  public StudentServiceImp(StudentRepository repository, StudentMapperImp studentMapperImp) {
    this.repository = repository;
    this.studentMapper = studentMapperImp;
  }

  public StudentResponseDTO save(StudentDTO studentDTO) {
    var student = studentMapper.fromDtoToStudent(studentDTO);
    return studentMapper.toStudentResponseDTO(student);
  }

  public List<StudentResponseDTO> findAll() {
    return repository.findAll().stream().map(studentMapper::toStudentResponseDTO).toList();
  }

  public Optional<Student> findById(UUID uuid) {
    return repository.findById(uuid);
  }


}
