package com.student.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.management.entity.Student;
import com.student.management.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> list =  studentRepo.findAll();
		return list;
	}

	@Override
	public Student saveStudent(Student student) {

		return studentRepo.save(student);
	}

}
