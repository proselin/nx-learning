package com.springapi.main.studentprofile;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface StudentProfileRepository extends JpaRepository<StudentProfile, Integer> {
  Optional<StudentProfile> findStudentProfileByStudentId(UUID studentId);
  Boolean removeStudentProfileByStudentId(UUID studentId);
}
