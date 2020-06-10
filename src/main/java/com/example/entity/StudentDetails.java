package com.example.entity;


import java.math.BigDecimal;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table
public class StudentDetails {

	@Id
	private Integer rollNo;
	private String name;
	private String standard;
	private BigDecimal marks ;
	private String grade;
	
	public StudentDetails(Integer rollNo, String name, String standard, BigDecimal marks, String grade) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.standard = standard;
		this.marks = marks;
		this.grade = grade;
	}
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public BigDecimal getMarks() {
		return marks;
	}
	public void setMarks(BigDecimal marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
