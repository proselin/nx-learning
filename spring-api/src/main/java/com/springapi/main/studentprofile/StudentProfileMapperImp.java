package com.springapi.main.studentprofile;

import com.springapi.main.student.Student;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StudentProfileMapperImp implements StudentProfileMapper{

  public StudentProfileResponseDTO toResponseStudentProfile(StudentProfile studentProfile) {
    var studentProfileResponseDTO = new StudentProfileResponseDTO();
    studentProfileResponseDTO.setStudentDetail(studentProfile.getStudent());
    studentProfileResponseDTO.setBio(studentProfile.getBio());
    return studentProfileResponseDTO;
  }

  public StudentProfile fromRequestDTO(StudentProfileDTO studentProfileDTO) {
    StudentProfile studentProfile = new StudentProfile();
    studentProfile.setBio(studentProfileDTO.getBio());

    var student = new Student();
    student.setId(UUID.fromString(studentProfileDTO.getStudent_id()));
    studentProfile.setStudent(student);

    return studentProfile;
  }

}
