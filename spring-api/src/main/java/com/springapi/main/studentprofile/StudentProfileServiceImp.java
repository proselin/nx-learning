package com.springapi.main.studentprofile;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StudentProfileServiceImp implements StudentProfileService {
  private final StudentProfileRepository studentProfileRepository;
  private final StudentProfileMapper studentProfileMapper;

  @Override
  public Boolean removeStudentProfile(String studentId) {
    return findByStudentId(studentId) != null && studentProfileRepository.removeStudentProfileByStudentId(UUID.fromString(studentId));
  }

  public StudentProfileResponseDTO findByStudentId(String studentId) {
    return studentProfileMapper.toResponseStudentProfile(studentProfileRepository.findStudentProfileByStudentId(UUID.fromString(studentId)).orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND)));
  }
}
