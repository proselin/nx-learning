package com.springapi.main.student;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
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

  public StudentResponseDTO findById(UUID uuid) {
    var student = repository.findById(uuid).orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    return studentMapper.toStudentResponseDTO(student);
  }

  public StudentResponseDTO findById(String id) {
    var student = repository.findById(UUID.fromString(id))
      .orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    return studentMapper.toStudentResponseDTO(student);
  }
}
