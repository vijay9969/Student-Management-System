package com.employee.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee.management.model.Employee;
import com.employee.management.repository.EmployeeRepository;

@SpringBootApplication
public class AngularApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AngularApplication.class, args);
	}
	@Autowired
	private EmployeeRepository empRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Vijay","Handal","Handal@gmail.com");
		empRepository.save(e1);
		Employee e2 = new Employee("Sumit","Shinde","Shinde@gmail.com");
		empRepository.save(e2);
		Employee e3 = new Employee("Rohit","Kamthe","Kamthe@gmail.com");
		empRepository.save(e3);
		
	}

}
