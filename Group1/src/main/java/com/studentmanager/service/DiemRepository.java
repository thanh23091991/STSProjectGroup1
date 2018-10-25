package com.studentmanager.service;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.studentmanager.entity.Diem;

public interface DiemRepository extends Repository<Diem, String> {
	List<Diem> findByMaSV(String maSV);
	List<Diem> findByMaMH(String maMH);
}
