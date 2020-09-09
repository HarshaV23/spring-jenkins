package com.example.service;

import com.example.model.Student;


import java.util.Optional;


public interface StudentService {
    public Iterable<Student> getAllStudents();
    public Optional<Student> getStudentById(String studentId);

}
