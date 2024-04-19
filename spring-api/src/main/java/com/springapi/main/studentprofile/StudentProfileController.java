package com.springapi.main.studentprofile;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentProfileController {
  private final StudentProfileService studentProfileService;

  @GetMapping
  public StudentProfileResponseDTO getStudentProfile(
    @RequestParam String studentId
  ) {
    return studentProfileService.findByStudentId(studentId);
  }

}
