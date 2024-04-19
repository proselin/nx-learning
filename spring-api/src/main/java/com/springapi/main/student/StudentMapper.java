package com.springapi.main.student;

public interface StudentMapper {
  Student fromDtoToStudent(StudentDTO studentDTO);
  StudentResponseDTO toStudentResponseDTO(Student student);
}
