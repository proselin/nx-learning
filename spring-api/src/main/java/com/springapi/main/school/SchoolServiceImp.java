package com.springapi.main.school;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolServiceImp implements SchoolService {
  private final SchoolMapper schoolMapper;
  private final SchoolRepository schoolRepository;

  public SchoolResponseDTO saveSchool(SchoolDTO schoolDTO) {
    return schoolMapper.toResponseSchools(schoolRepository.save(schoolMapper.toSchool(schoolDTO)));
  }

  public List<SchoolResponseDTO> getAllSchools() {
    return schoolRepository.findAll().stream().map(
      schoolMapper::toResponseSchools
    ).toList();
  }
}
