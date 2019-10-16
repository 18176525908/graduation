package com.graduation_project.entity;

public class Subjects {

	private Integer su_id;
    private String su_name;
    private String su_description;
    private String tea_ID;
    private Teacher teacher;
	public Integer getSu_id() {
		return su_id;
	}
	public void setSu_id(Integer su_id) {
		this.su_id = su_id;
	}
	public String getSu_name() {
		return su_name;
	}
	public void setSu_name(String su_name) {
		this.su_name = su_name;
	}
	public String getSu_description() {
		return su_description;
	}
	public void setSu_description(String su_description) {
		this.su_description = su_description;
	}
	public String getTea_ID() {
		return tea_ID;
	}
	public void setTea_ID(String tea_ID) {
		this.tea_ID = tea_ID;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Subjects [su_id=" + su_id + ", su_name=" + su_name + ", su_description=" + su_description + ", tea_ID="
				+ tea_ID + "]";
	}
}
