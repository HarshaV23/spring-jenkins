package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Student {
    @Id
    @Column(name="student_id")
    private String studentId;
    @Column(name="student_name")
    private String studentName;
    @Column(name="student_gpa")
    private String studentGPA;

    public Student(String studentId, String studentName, String studentGPA) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentGPA = studentGPA;
    }

    public Student() {
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGPA() {
        return studentGPA;
    }

    public void setStudentGPA(String studentGPA) {
        this.studentGPA = studentGPA;
    }
}
