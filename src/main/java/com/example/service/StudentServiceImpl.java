package com.example.service;

import com.example.MyRepo;
import com.example.model.Student;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Service
//@EnableAutoConfiguration
//@EnableTransactionManagement
public class StudentServiceImpl implements StudentService {
   private MyRepo myRepo;

    public StudentServiceImpl(MyRepo myRepo) {
        this.myRepo = myRepo;
    }

    @Override
    @Transactional
    public Iterable<Student> getAllStudents() {
        return myRepo.findAll();
    }

    @Override
    @Transactional
    public Optional<Student> getStudentById(String studentId) {

        return myRepo.findById(studentId);
    }
}
