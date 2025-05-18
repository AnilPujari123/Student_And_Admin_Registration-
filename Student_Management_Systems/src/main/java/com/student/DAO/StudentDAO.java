package com.student.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.student.entity.StudentDetails;
import com.student.repository.StudentRepository;
@Component
public class StudentDAO {
	@Autowired
	private	StudentRepository studentRepository;
	public StudentDetails insertStudentDetails(StudentDetails studentDetails) {
		StudentDetails details =studentRepository.save(studentDetails);
		return details;
	}
	public void insertStudentDetails() {
		
	}
}
