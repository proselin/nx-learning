package com.springapi.main.studentprofile;

import com.springapi.main.student.Student;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StudentProfileResponseDTO {
  private Student studentDetail;
  private String bio;
}
