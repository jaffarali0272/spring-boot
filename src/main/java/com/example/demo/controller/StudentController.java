package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;

@RestController
public class StudentController {

	@Autowired
	StudentRepo studentRepo;
	
	@PostMapping("/add")
	public void add(@RequestBody Student std) {
		studentRepo.save(std);
	}
	@GetMapping("/get")
	public List<Student> getAll(){
		return studentRepo.findAll();
	}
	
	
	@GetMapping("/getById")
	public Student getById(@Param("id")int id){
		return studentRepo.getById(id);
	}
}
