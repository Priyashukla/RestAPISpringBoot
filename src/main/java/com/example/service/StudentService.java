package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import com.example.entity.StudentDetails;

public interface StudentService {
	
	@Transactional
	public StudentDetails save(StudentDetails student);
	
	@Transactional
	public List<StudentDetails> getAllStudent();

}
