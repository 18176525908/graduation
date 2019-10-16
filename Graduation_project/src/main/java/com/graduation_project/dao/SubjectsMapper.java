package com.graduation_project.dao;

import java.util.List;

import com.graduation_project.entity.Subjects;

public interface SubjectsMapper {

	public List<Subjects> selectAllSubjects();
	
	public boolean addSubjects(Subjects subjects);
	
	public Subjects selectSubjectsById(int su_id);
	
	public boolean updateSubjects(Subjects subjects);
	
	public int deleteSubjects(int su_id);
}
