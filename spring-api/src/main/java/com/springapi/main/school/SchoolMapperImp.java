package com.springapi.main.school;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
public class SchoolMapperImp implements SchoolMapper {

  public School toSchool(SchoolDTO schoolDTO) {
    var school = new School();
    school.setName(schoolDTO.getName());
    return school;
  }

  public SchoolResponseDTO toResponseSchools(School school) {
    var schoolResDTO = new SchoolResponseDTO();
    schoolResDTO.setName(school.getName());
    schoolResDTO.setId(school.getId());
    return schoolResDTO;
  }
}
