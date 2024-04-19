package com.springapi.main.school;

import java.util.List;

public interface SchoolService {
  SchoolResponseDTO saveSchool(SchoolDTO school);

  List<SchoolResponseDTO> getAllSchools();
}
