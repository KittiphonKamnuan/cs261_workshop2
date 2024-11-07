package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
    // Find all students by their first name
    List<Student> findByFirstName(String firstName);
    
    // Find students whose age is greater than a certain value
    List<Student> findByAgeGreaterThan(int age);

    // Custom query method to find students by last name
    List<Student> findByLastName(String lastName);

    // Custom query method to find a student by email
    Student findByEmail(String email);

    // Custom query to find students whose first name starts with a certain string
    List<Student> findByFirstNameStartingWith(String prefix);

    // Find students ordered by their first name
    List<Student> findAllByOrderByFirstNameAsc();
    
    // Find students whose last name contains a specific keyword
    List<Student> findByLastNameContaining(String keyword);

    // Find students by both first name and last name
    List<Student> findByFirstNameAndLastName(String firstName, String lastName);
}
