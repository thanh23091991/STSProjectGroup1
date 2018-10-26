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
	


	// Mapping table SinhVien
	@Autowired
	private SinhVienRepository sinhVienRepository;

	@RequestMapping(value = { "/", "/sinhVien-list" })
	public String listCustomer(Model model) {
		model.addAttribute("listSinhVien", sinhVienRepository.findAll());
		return "/sinhVien-list";
	}

	@RequestMapping("/sinhVien-save")
	public String insertCar(Model model) {
		model.addAttribute("sinhVien", new SinhVien());
		return "sinhVien-save";
	}

	@RequestMapping("/sinhVien-view/{maSV}")
	public String viewCustomer(@PathVariable String maSV, Model model) {
		Optional<SinhVien> sinhVien = sinhVienRepository.findById(maSV);
		if (sinhVien.isPresent()) {
			model.addAttribute("sinhVien", sinhVien.get());
		}
		return "sinhVien-view";
	}

	@RequestMapping("/sinhVien-update/{maSV}")
	public String updateCar(@PathVariable String maSV, Model model) {
		Optional<SinhVien> sinhVien = sinhVienRepository.findById(maSV);
		if (sinhVien.isPresent()) {
			model.addAttribute("carId2", maSV);
			model.addAttribute("sinhVien", sinhVien.get());
		}
		return "sinhVien-update";
	}

	@RequestMapping("/saveSinhVien")
	public String doSaveCar(@ModelAttribute("SinhVien") SinhVien sinhVien, Model model) {
		sinhVienRepository.save(sinhVien);
		model.addAttribute("listCar", sinhVienRepository.findAll());
		return "sinhVien-list";
	}

	@RequestMapping("/updateSinhVien")
	public String doUpdateCar(@ModelAttribute("sinhVien") SinhVien sinhVien, Model model) {
		sinhVienRepository.updateSinhVien(sinhVien.getMaSV(), sinhVien.getTenSV(), sinhVien.isGioiTinh(),
				sinhVien.getNgaySinh(),sinhVien.getQueQuan(), sinhVien.getMaLop());
		model.addAttribute("listSinhVien", sinhVienRepository.findAll());
		return "sinhVien-list";
	}

	@RequestMapping("/sinhVienDelete/{maSV}")
	public String doDeleteCar(@PathVariable String maSV, Model model) {
		sinhVienRepository.deleteById(maSV);
		model.addAttribute("listSinhVien", sinhVienRepository.findAll());
		return "sinhVien-list";
	}


}
