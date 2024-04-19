package com.springapi.main.studentprofile;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class StudentProfileDTO {
  private String bio;
  @NonNull
  @NotEmpty
  private String student_id;
}
