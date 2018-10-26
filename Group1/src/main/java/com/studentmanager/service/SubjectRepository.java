package com.studentmanager.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentmanager.entity.MonHoc;

@Repository
public interface SubjectRepository extends JpaRepository<MonHoc, String> {

	void deleteById(String id);

}
