package com.springapi.main.school;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SchoolController {
  private final SchoolService schoolService;

  @PostMapping("/school")
  public SchoolDTO saveSchool(@RequestBody SchoolDTO schoolDTO) {
    return schoolService.saveSchool(schoolDTO);
  }

  @GetMapping("/schools")
  public List<SchoolResponseDTO> getAllSchools() {
    return this.schoolService.getAllSchools();
  }


}
