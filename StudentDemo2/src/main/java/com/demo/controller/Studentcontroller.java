package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Student;
import com.demo.repository.Studinterface;

@RestController
public class Studentcontroller 
{
	@Autowired
	private Studinterface stud;
	
	
	@PostMapping("/insert")
	public Student insertstudent(@RequestBody Student s)
	{
		return stud.save(s);
	}
	
	@PostMapping("/update")
	public Student updatestudent(@RequestBody Student s)
	{
		return stud.save(s);
	}
	
	
	@PostMapping("/delete")
	public void deletestudent()
	{
		stud.deleteAll();
	}
	
	
	@GetMapping("/view")
	public List<Student> viewstudent()
	{
		return stud.findAll();
	}

}
