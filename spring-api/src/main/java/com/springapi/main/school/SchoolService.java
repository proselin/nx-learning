package com.springapi.main.school;

import java.util.List;

public interface SchoolService {
  SchoolDTO saveSchool(SchoolDTO school);

  List<SchoolResponseDTO> getAllSchools();
}
