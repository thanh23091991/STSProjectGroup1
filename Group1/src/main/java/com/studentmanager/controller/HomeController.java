package com.studentmanager.controller;

<<<<<<< HEAD
import org.springframework.stereotype.Controller;
=======
import java.util.ArrayList;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

>>>>>>> 64555b52f96d5c633a26c83a6d5ea68aa091ab16
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.studentmanager.entity.SinhVien;
import com.studentmanager.service.SinhVienRepository;

@Controller
public class HomeController {
<<<<<<< HEAD
	
	
=======
	@Autowired
	private DiemRepository diemRepository;

>>>>>>> 64555b52f96d5c633a26c83a6d5ea68aa091ab16
	@RequestMapping("/")
	public String defaul() {
		return "Home";
	}

	@RequestMapping(value = "/subject", method = RequestMethod.POST)
	public String getSubject() {
		return "Subject";
	}

	@RequestMapping(value = "/classes", method = RequestMethod.POST)
	public String getClasses() {
		return "Classes";
	}
<<<<<<< HEAD
=======

	@RequestMapping(value = "/point", method = RequestMethod.GET)
	public String getPoints(Model model) {
		List<Diem> diems = new ArrayList<Diem>();
		diems = diemRepository.findAll();
		model.addAttribute("pointList", diems);
		return "Point";
	}

	@RequestMapping(value = "/point", method = RequestMethod.POST)
	public String getPoint() {
		return "Point";
	}

>>>>>>> 64555b52f96d5c633a26c83a6d5ea68aa091ab16
}
