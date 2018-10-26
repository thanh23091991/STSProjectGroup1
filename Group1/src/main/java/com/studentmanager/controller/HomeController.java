package com.studentmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

=======

@Controller
public class HomeController {
>>>>>>> 9c0ae79466e526ca0e59dd160bbe86a8c4484030
	@RequestMapping("/")
	public String defaul() {
		return "Login";
	}
<<<<<<< HEAD

	@RequestMapping(value = "/subject", method = RequestMethod.POST)
	public String getSubject() {
		return "Subject";
	}

	@RequestMapping(value = "/classes", method = RequestMethod.POST)
	public String getClasses() {
		return "Classes";
	}

=======
>>>>>>> 9c0ae79466e526ca0e59dd160bbe86a8c4484030
}
