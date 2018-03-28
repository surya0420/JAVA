package com.example.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.repository.StudentRepository;

@RestController
@RequestMapping("/studentDetails")
public class StudentResource {

	@Autowired
	StudentRepository studentRepository;

	@GetMapping("/{id}")
	public Student getDetailsById(@PathVariable final int id) {
		return studentRepository.findOne(id);
	}

	@GetMapping("/all")
	public List<Student> getAllDetails() {
		return studentRepository.findAll();
	}
}
