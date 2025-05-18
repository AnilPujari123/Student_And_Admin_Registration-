package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.StudentDetails;
														//Entity Class  //Primary Key data type
public interface StudentRepository extends JpaRepository<StudentDetails, Integer>
{

}
