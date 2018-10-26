package com.studentmanager.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.studentmanager.entity.MonHoc;
import com.studentmanager.service.StudentRepository;
import com.studentmanager.service.SubjectRepository;

@Controller
public class SubjectController {

	@Autowired
	SubjectRepository subjectRepository;

	@RequestMapping("/subject-show")
	public String showSubject(Model model) {
		model.addAttribute("subjectlist", subjectRepository.getSubject());
		return "TableSubjectResult";
	}

	@RequestMapping("/subjectDelete/{id}")
	public String doDeleteCustomer(@PathVariable String id, Model model) {
		subjectRepository.deleteSubject(id);;
		model.addAttribute("subjectlist", subjectRepository.getSubject());
		return " TableSubjectResult";
	}

	@RequestMapping(value = "/insSubInfo", method = RequestMethod.GET)
	public String insertSubInfo() {
		return "InsertSubject";
	}

	public String doInsertSubject(HttpServletRequest request, Model model) {
		String maMH = request.getParameter("maMH");
		String tenMH = request.getParameter("tenMH");
		String sotrinh = request.getParameter("sotrinh");

		if (null != maMH && "".equals(maMH)) {
			MonHoc monhoc = new MonHoc(maMH, tenMH, Integer.parseInt(sotrinh));
		} else {

		}
		return "";
	}

}
