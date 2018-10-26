package com.studentmanager.controller;

<<<<<<< HEAD
=======

>>>>>>> 2c9bbb756e9d4abf80735bdf5d3aecb39fc4904c
import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.RequestMethod;

import com.studentmanager.service.DiemRepository;
>>>>>>> 2c9bbb756e9d4abf80735bdf5d3aecb39fc4904c

@Controller
public class HomeController {

	@RequestMapping("/")
	public String defaul() {
		return "Home";
	}

<<<<<<< HEAD
=======
	@RequestMapping(value = "/subject", method = RequestMethod.POST)
	public String getSubject() {
		return "Subject";
	}

	@RequestMapping(value = "/classes", method = RequestMethod.POST)
	public String getClasses() {
		return "Classes";
	}


>>>>>>> 2c9bbb756e9d4abf80735bdf5d3aecb39fc4904c
}
