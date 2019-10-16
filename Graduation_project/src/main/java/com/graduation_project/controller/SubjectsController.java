package com.graduation_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.graduation_project.entity.Subjects;
import com.graduation_project.service.SubjectsService;

@Controller
public class SubjectsController {

	@Autowired
	private SubjectsService  ss;
	
	@RequestMapping("/selectAllSubjects")
	public String selectAllSubjects(Model model) {
		List<Subjects> ls = ss.selectAllSubjects();
		model.addAttribute("subjects",ls);
		return "subjectslist";
	}
	
	@RequestMapping("/addSubjects")
	public String addSubjects(Subjects subjects) {
		boolean row = ss.addSubjects(subjects);
		return "forward:selectAllSubjects";
	}
	
	@RequestMapping("/selectSubjectsById")
	public String selectSubjectsById(Model model,int su_id) {
		Subjects s = ss.selectSubjectsById(su_id);
		model.addAttribute("subjects",s);
		return "updatesubjects";
	}
	
	@RequestMapping("/updateSubjects")
	public String updateSubjects(Subjects subjects) {
		boolean result = ss.updateSubjects(subjects);
		return "forward:selectAllSubjects";
	}
	
	@RequestMapping("/delectSubjects")
	public String deleteSubjects(int su_id) {
		int result = ss.deleteSubjects(su_id);
		return "forward:selectAllSubjects";
	}
}
