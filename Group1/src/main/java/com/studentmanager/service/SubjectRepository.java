package com.studentmanager.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentmanager.entity.MonHoc;

@Repository
public interface SubjectRepository extends JpaRepository<MonHoc, String> {

	public void deleteSubject(String maMH);
	public MonHoc saveSubject(MonHoc monhoc);
	public List<MonHoc> getSubject();
	public MonHoc getSubject(String maMH);
	

	
}
