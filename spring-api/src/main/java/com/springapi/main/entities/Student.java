package com.springapi.main.entities;

import jakarta.persistence.*;

@Entity
@Table(
  name = "SA_Student"
)
public class Student {

  @Id
  @GeneratedValue(
    strategy = GenerationType.IDENTITY,
    generator = "SA_"
  )
  private Integer id;

  @Column
  private String firstName;

  @Column
  private String lastName;

  @Column(unique = true)
  private String email;

  @Column()
  private Integer age;

  @Column(
    updatable = false,
    unique = true
  )
  private String history_trace_id;

  public Student() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
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
}
