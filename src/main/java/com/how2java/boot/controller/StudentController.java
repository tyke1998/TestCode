package com.how2java.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.how2java.boot.mapper.StudentMapper;
import com.how2java.boot.pojo.student;

@Controller
public class StudentController {

	@Autowired
	StudentMapper studentMapper;
	
	@RequestMapping("/listStudent")
	public String listStudent(Model model) {
		List<student> students = studentMapper.findAll();
		model.addAttribute("students", students);
		return "listStudent";
	}
}
