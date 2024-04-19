package com.springapi.main.student;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StudentService {
  StudentResponseDTO save(StudentDTO studentDTO);
  List<StudentResponseDTO> findAll();
  Optional<Student> findById(UUID uuid);
}
