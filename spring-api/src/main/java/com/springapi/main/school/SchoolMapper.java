package com.springapi.main.school;

public interface SchoolMapper {
  School toSchool(SchoolDTO schoolDTO);
  SchoolResponseDTO toResponseSchools(School school);
}
