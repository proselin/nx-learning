package com.springapi.main.school;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.springapi.main.student.Student;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "SA_school")
public class School {
  @Id
  @GeneratedValue
  private int id;

  @Column
  private String name;

  @OneToMany(mappedBy = "school")
  @JsonManagedReference
  private List<Student> students;
}
