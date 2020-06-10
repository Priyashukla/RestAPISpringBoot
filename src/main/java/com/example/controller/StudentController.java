package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.StudentDetails;
import com.example.service.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@RequestMapping(method=RequestMethod.GET, path="/students")
	public List<StudentDetails> retreiveAllSudents(){
		return service.getAllStudent();
	}
	
	@RequestMapping(method=RequestMethod.POST, path="/saveStudent")
	public StudentDetails saveUser(@RequestBody StudentDetails student) {
		return service.save(student);
	}

}
