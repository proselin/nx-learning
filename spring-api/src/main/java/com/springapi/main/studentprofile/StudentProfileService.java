package com.springapi.main.studentprofile;

public interface StudentProfileService {
  StudentProfileResponseDTO findByStudentId(String studentId);

  Boolean removeStudentProfile(String studentId);
}
