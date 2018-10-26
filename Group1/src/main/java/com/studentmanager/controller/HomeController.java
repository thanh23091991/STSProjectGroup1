package com.studentmanager.controller;

<<<<<<< Upstream, based on origin/master
import java.util.ArrayList;
import java.util.List;
=======
import java.util.Optional;
>>>>>>> 01a4a03 Dung commit

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
<<<<<<< Upstream, based on origin/master
=======
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
>>>>>>> 01a4a03 Dung commit
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

<<<<<<< Upstream, based on origin/master
import com.studentmanager.entity.Diem;
import com.studentmanager.service.DiemRepository;
=======
import com.studentmanager.entity.SinhVien;
import com.studentmanager.service.SinhVienRepository;
>>>>>>> 01a4a03 Dung commit

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
<<<<<<< Upstream, based on origin/master
	@RequestMapping(value = "/point", method = RequestMethod.GET)
	public String getPoints(Model model) {
		List<Diem> diems = new ArrayList<Diem>();
		diems = diemRepository.findAll();
		model.addAttribute("pointList", diems);
		
=======

	@RequestMapping(value = "/point", method = RequestMethod.POST)
	public String getPoint() {
>>>>>>> 01a4a03 Dung commit
		return "Point";
	}
<<<<<<< Upstream, based on origin/master
	
=======

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

>>>>>>> 01a4a03 Dung commit
}
