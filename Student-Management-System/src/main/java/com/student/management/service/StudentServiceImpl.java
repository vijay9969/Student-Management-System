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

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id).get();
		
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
	}

}
