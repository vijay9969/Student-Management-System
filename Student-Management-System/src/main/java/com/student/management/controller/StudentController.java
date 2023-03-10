package com.student.management.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.student.management.entity.Student;
import com.student.management.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentSer;
	
	@GetMapping("/students")
	public String getAllStudents(Model model){
//		return studentSer.getAllAtudents();
		model.addAttribute("students", studentSer.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createstudentFrom(Model model) {
		Student s = new Student();
		model.addAttribute("student",s);
		return "create_student";
	}
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student){
		
		studentSer.saveStudent(student);
		return "redirect:/students";
	}
	@GetMapping("/students/edit/{id}")
	public String editStudents(@PathVariable("id") Long id,Model model) {
		model.addAttribute("student",studentSer.getStudentById(id));
		return "update_student";
	}
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable("id")Long id,@ModelAttribute("student")Student student ,Model model) {
		Student existingStudents = studentSer.getStudentById(id);
		existingStudents.setId(id);
		existingStudents.setImg(student.getImg());
		existingStudents.setFirstName(student.getFirstName());
		existingStudents.setLastName(student.getLastName());
		existingStudents.setEmail(student.getEmail());
		studentSer.updateStudent(existingStudents);
		return "redirect:/students";
		
		
	}
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable("id") Long id) {
		studentSer.deleteStudentById(id);
		return "redirect:/students";	
	}
}
