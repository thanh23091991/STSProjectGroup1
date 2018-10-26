package com.studentmanager.controller;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.studentmanager.entity.Diem;
import com.studentmanager.service.DiemRepository;

import com.studentmanager.entity.SinhVien;
import com.studentmanager.service.SinhVienRepository;

@Controller
public class HomeController {
	@Autowired
	private DiemRepository diemRepository;

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

}
