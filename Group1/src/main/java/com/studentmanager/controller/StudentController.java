package com.studentmanager.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import com.studentmanager.entity.SinhVien;
import com.studentmanager.service.SinhVienRepository;

@Controller
public class StudentController {

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
				sinhVien.getNgaySinh(), sinhVien.getQueQuan(), sinhVien.getMaLop());
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
