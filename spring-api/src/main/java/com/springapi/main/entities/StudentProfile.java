package com.springapi.main.entities;

import jakarta.persistence.*;

@Entity
@Table(name="SA_student_profile")
public class StudentProfile {

  @Id
  @GeneratedValue
  private int id;
  @Column
  private String bio;

  @OneToOne()
  @JoinColumn(
    name="student_id"
  )
  private Student student;

  public StudentProfile() {}

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }
}
