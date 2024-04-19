package com.springapi.main.studentprofile;

public interface StudentProfileMapper {
  StudentProfileResponseDTO toResponseStudentProfile(StudentProfile studentProfile);
  StudentProfile fromRequestDTO(StudentProfileDTO studentProfileDTO);
}
