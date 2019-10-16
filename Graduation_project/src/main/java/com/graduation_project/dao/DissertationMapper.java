package com.graduation_project.dao;

import java.util.List;

import com.graduation_project.entity.Dissertation;

public interface DissertationMapper {

	public List<Dissertation> selectAllDissertation();
	
	public Dissertation selectDissertationById(int d_id);
	
//	public Dissertation selectDissertationBy(String );

	public boolean updateDissertation(Dissertation dissertation);
}
