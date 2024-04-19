package com.springapi.main.studentprofile;

import com.springapi.main.student.Student;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "SA_student_profile")
public class StudentProfile {
  @Id
  @GeneratedValue
  private int id;

  @Column
  private String bio;

  @OneToOne()
  @JoinColumn(name = "student_id")
  private Student student;
}
