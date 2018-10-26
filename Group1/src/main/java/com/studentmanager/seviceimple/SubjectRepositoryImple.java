package com.studentmanager.seviceimple;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.studentmanager.entity.MonHoc;
import com.studentmanager.service.SubjectRepository;

public abstract class  SubjectRepositoryImple implements SubjectRepository {

	@Autowired
	SubjectRepository subjectRepository;
	
	@Override
	public List<MonHoc> getSubject() {
		return subjectRepository.findAll();
	}

	@Override
	public MonHoc saveSubject(MonHoc monhoc) {
		return subjectRepository.save(monhoc);
	}

	@Override
	public void deleteSubject(String maMH) {
		subjectRepository.deleteById(maMH);
	}

	@Override
	public MonHoc getSubject(String maMH) {
		return subjectRepository.getOne(maMH);
	}
	
	

}
