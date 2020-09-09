package com.example.springbootjenkinsdemo;

import com.example.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJenkinsDemoApplication  {
//	@Autowired
//	private StudentRepository studentRepository;
//
//	public SpringbootJenkinsDemoApplication() {
//	}

//	public SpringbootJenkinsDemoApplication(StudentRepository studentRepository) {
//		this.studentRepository = studentRepository;
//	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinsDemoApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		 studentRepository.save(new Student("1", "Harsha", "A"));
//		studentRepository.save(new Student("2", "Nithin", "A+"));
//		studentRepository.save(new Student("3", "Mohan", "S"));
//	}
}
