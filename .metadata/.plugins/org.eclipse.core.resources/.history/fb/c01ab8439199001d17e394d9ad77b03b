package com.student.management.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
