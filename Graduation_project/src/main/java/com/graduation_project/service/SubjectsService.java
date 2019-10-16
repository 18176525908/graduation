package com.graduation_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graduation_project.dao.SubjectsMapper;
import com.graduation_project.entity.Subjects;

@Service
public class SubjectsService {

	@Autowired
	private SubjectsMapper sm;
	
	public List<Subjects> selectAllSubjects(){
		return sm.selectAllSubjects();
	}
	
	public boolean addSubjects(Subjects subjects) {
		boolean row = sm.addSubjects(subjects);
		return true;
	}
	
	public Subjects selectSubjectsById(int su_id) {
		return sm.selectSubjectsById(su_id);
	}
	
	public boolean updateSubjects(Subjects subjects) {
		boolean result = sm.updateSubjects(subjects);
		return result;
	}
	
	public int deleteSubjects(int su_id) {
		int result = sm.deleteSubjects(su_id);
		return result;
	}
}
