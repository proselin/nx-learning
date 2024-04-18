package com.springapi.main.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "SA_school")
public class School {
  @Id
  @GeneratedValue
  private int id;

  @Column
  private String name;


  @OneToMany(
    mappedBy = "school",
    cascade = CascadeType.ALL
  )
  @JsonManagedReference
  private List<Student> students;

  public School() {}

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

}