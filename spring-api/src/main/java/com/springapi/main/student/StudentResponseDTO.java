package com.springapi.main.student;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentResponseDTO {
  String firstName;
  String lastName;
  String email;
  Integer age;
  Integer schoolId;
}
