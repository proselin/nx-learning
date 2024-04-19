package com.springapi.main.student;

import com.springapi.main.school.School;
import org.springframework.stereotype.Service;

@Service
public class StudentMapperImp implements StudentMapper {

  public Student fromDtoToStudent(StudentDTO studentDTO) {
    var student = new Student();
    student.setAge(studentDTO.getAge());
    student.setFirstName(studentDTO.getFirstName());
    student.setLastName(studentDTO.getLastName());
    student.setEmail(studentDTO.getEmail());

    var school = new School();
    school.setId(studentDTO.getSchoolId());
    student.setSchool(school);

    return student;
  }

  public StudentResponseDTO toStudentResponseDTO(Student student) {
    StudentResponseDTO dto = new StudentResponseDTO();
    dto.setFirstName(student.getFirstName());
    dto.setLastName(student.getLastName());
    dto.setAge(student.getAge());
    dto.setEmail(student.getEmail());
    return dto;
  }

}
