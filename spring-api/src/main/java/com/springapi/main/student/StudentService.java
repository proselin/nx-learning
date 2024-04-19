package com.springapi.main.student;

import java.util.List;
import java.util.UUID;

public interface StudentService {
  StudentResponseDTO save(StudentDTO studentDTO);

  List<StudentResponseDTO> findAll();

  StudentResponseDTO findById(UUID uuid);

  StudentResponseDTO findById(String id);
}
