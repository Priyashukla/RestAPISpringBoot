package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.StudentDetails;
import com.example.repo.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo repo;
	
	@Override
	public StudentDetails save(StudentDetails student) {
		
		return repo.save(student);
	}

	@Override
	public List<StudentDetails> getAllStudent() {
		// TODO Auto-generated method stub
		return repo.findByOrderByMarksAsc();
	}

}
