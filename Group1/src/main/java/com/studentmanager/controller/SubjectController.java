package com.studentmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.studentmanager.entity.MonHoc;
import com.studentmanager.service.StudentRepository;
import com.studentmanager.service.SubjectRepository;

@Controller
public class SubjectController {

	@Autowired
	SubjectRepository subjectRepository;
	
	@RequestMapping("/subject-show")
	public String showSubject(Model model) {
		model.addAttribute("subjectlist", subjectRepository.findAll());
		return "TableSubjectResult";
	}
	
	
	@RequestMapping("/subjectDelete/{id}")
	public String doDeleteCustomer(@PathVariable String id, Model model) {
		subjectRepository.deleteById(id);
		model.addAttribute("subjectlist", subjectRepository.findAll());
		return " TableSubjectResult";
	}
	
	@RequestMapping("/insertSubjectinfo")
	public String insertSubInfo() {
		return "redirect:InsertSubject";
	}
	
	
	
	
}
