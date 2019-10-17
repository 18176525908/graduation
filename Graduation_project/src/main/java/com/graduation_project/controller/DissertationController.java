package com.graduation_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.graduation_project.entity.Dissertation;
import com.graduation_project.service.DissertationService;


@Controller
public class DissertationController {

	@Autowired
	private DissertationService  ds;
	
	/**
	 * 查看所有论文
	 */
	@RequestMapping("/selectAllDissertation")
	public String selectAllDissertation(Model model) {
		List<Dissertation> ls = ds.selectAllDissertation();
		model.addAttribute("dissertation",ls);
		return "dissertationlist";
	}
	
	/**
	 * 通过id查看论文
	 */
	@RequestMapping("/selectDissertationById")
	public String selectDissertationById(Model model,int d_id) {
		Dissertation d = ds.selectDissertationById(d_id);
		model.addAttribute("dissertation",d);
		return "updatedissertation";
	}
	
	/**
	 * 修改论文信息
	 */
	@RequestMapping("/updateDissertation")
	public String updateSubjects(Dissertation dissertation) {
		boolean result = ds.updateDissertation(dissertation);
		return "forward:selectAllDissertation";
	}
	
	/**
	 * 通过论文查看信息
	 */
	@RequestMapping("/selectDissertationByaddress")
	public String selectDissertationByaddress(Model model,String d_address) {
		Dissertation d = ds.selectDissertationByaddress(d_address);
		model.addAttribute("dissertation",d);
		return "updatedissertation";
	}
}
