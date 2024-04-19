package com.springapi.main.student;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.springapi.main.school.School;
import com.springapi.main.studentprofile.StudentProfile;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(
  name = "SA_Student"
)
@Getter
@Setter
@NoArgsConstructor
public class Student {

  @Id
  @UuidGenerator
  private UUID id;

  @Column
  private String firstName;

  @Column
  private String lastName;

  @Column(unique = true)
  private String email;

  @Column()
  private Integer age;

  @OneToOne(
    mappedBy = "student",
    cascade = CascadeType.ALL
  )
  private StudentProfile studentProfile;

  @ManyToOne()
  @JoinColumn(
    name = "school_id"
  )
  @JsonBackReference
  private School school;
}
