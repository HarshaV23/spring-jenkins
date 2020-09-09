package com.example.rest;

import com.example.exception.StudentNotFoundException;
import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_ATOM_XML_VALUE},value="/students")
    public ResponseEntity<Iterable<Student>> getAllStudents(){
        return ResponseEntity.status(HttpStatus.OK).body(service.getAllStudents());
    }

    @RequestMapping(method= RequestMethod.GET,produces={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_ATOM_XML_VALUE},value="/student/{studentId}")
    public ResponseEntity<Optional<Student>> getStudentById(@PathVariable("studentId") String studentId) throws StudentNotFoundException {
        Optional<Student> student=service.getStudentById(studentId);
        Student student1=student.get();
        if(student1==null){
            throw new StudentNotFoundException("Student Id not Found!");
        }
        return new ResponseEntity<Optional<Student>>(service.getStudentById(studentId),HttpStatus.OK);
    }
}
