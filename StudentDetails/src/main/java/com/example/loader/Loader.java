package com.example.loader;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.Student;
import com.example.repository.StudentRepository;

@Component
public class Loader {
	@Autowired
	StudentRepository studentRepository;

	@PostConstruct
	public void loadAll() {

		studentRepository.save(getData());
		System.out.printf("Loading Completed");

	}

	private List<Student> getData() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "Surya", "123456", "Hanumantha Reddy", "ECE", "JNTUA"));
		students.add(new Student(2, "Sowji", "1234562", "Hanumantha Reddy", "CSE", "GPREC"));
		students.add(new Student(3, "Divya", "1234561", "Rahunatha Reddy", "CSE", "AIT"));
		students.add(new Student(4, "Tanuja", "1234563", "Sankar Reddy", "CA", "MM"));
		return students;
	}
}
