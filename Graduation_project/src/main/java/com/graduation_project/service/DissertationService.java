package com.graduation_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graduation_project.dao.DissertationMapper;
import com.graduation_project.entity.Dissertation;


@Service
public class DissertationService {

	@Autowired
	private DissertationMapper dm;
	
	public List<Dissertation> selectAllDissertation(){
		return dm.selectAllDissertation();
	}
	
	
	public Dissertation selectDissertationById(int d_id) {
		return dm.selectDissertationById(d_id);
	}


	public boolean updateDissertation(Dissertation dissertation) {
		boolean result = dm.updateDissertation(dissertation);
		return true;
	}


	public Dissertation selectDissertationByaddress(String d_address) {
		
		return dm.selectDissertationByaddress(d_address);
	}
	
}
