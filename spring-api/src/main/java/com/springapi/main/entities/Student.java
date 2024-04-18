package com.springapi.main.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(
  name = "SA_Student"
)
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

  public Student() {}

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public School getSchool() {
    return school;
  }

  public void setSchool(School school) {
    this.school = school;
  }

  public StudentProfile getStudentProfile() {
    return studentProfile;
  }

  public void setStudentProfile(StudentProfile studentProfile) {
    this.studentProfile = studentProfile;
  }
}
