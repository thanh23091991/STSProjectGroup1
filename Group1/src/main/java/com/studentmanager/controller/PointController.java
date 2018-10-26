package com.studentmanager.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.studentmanager.entity.Diem;
import com.studentmanager.service.DiemRepository;

@Controller
public class PointController {
	@Autowired
	private DiemRepository diemRepository;
	
	@RequestMapping(value = "/point", method = RequestMethod.GET)
	public String getPoints(Model model) {
		List<Diem> diems = new ArrayList<Diem>();
		diems = diemRepository.findAll();
		model.addAttribute("pointList", diems);
		
		return "Point";
	}
	
	@RequestMapping(value = "/insPoint", method = RequestMethod.GET)
	public String getInsPoint() {

		return "InsertPoint";
	}
	
	@RequestMapping(value = "/insertPoint", method = RequestMethod.POST)
	public String insertPoint(@RequestParam("masv") String masv, @RequestParam("mamh") String mamh,
			@RequestParam("diem1") int diem1, @RequestParam("diem2") int diem2, @RequestParam("semester") int semester) {

		Diem diem = new Diem(masv, mamh, semester, diem1, diem2);
		diemRepository.save(diem);
		
		return "InsertPoint";
	}
}
