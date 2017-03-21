package com.heqing.test.bean;

import java.io.Serializable;
import java.util.Set;

public class Classes implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private Teacher headTeacher;	//班主任
	private Set<Teacher> teachers;	//授课教师
	private Teacher classDirector;	//年级主任


	/**
	 * 获取班级id
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * 设置班级id
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 获取班级名称
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置班级名称
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取班主任
	 * @return the headTeacher
	 */
	public Teacher getHeadTeacher() {
		return headTeacher;
	}
	/**
	 * 设置班主任
	 * @param headTeacher the headTeacher to set
	 */
	public void setHeadTeacher(Teacher headTeacher) {
		this.headTeacher = headTeacher;
	}

	/**
	 * 获取班级多个授课教师
	 * @return the teachers
	 */
	public Set<Teacher> getTeachers() {
		return teachers;
	}
	/**
	 * 设置班级多个授课教师
	 * @param teachers the teachers to set
	 */
	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}

	/**
	 * 获取班级年级主任
	 * @return the classDirector
	 */
	public Teacher getClassDirector() {
		return classDirector;
	}
	/**
	 * 设置班级年级主任
	 * @param classDirector the classDirector to set
	 */
	public void setClassDirector(Teacher classDirector) {
		this.classDirector = classDirector;
	}

	public static Classes getClasses(Classes c){
		Classes classes = new Classes();
		classes.setId(c.id);
		classes.setName(c.name);
		return classes;
	}
}
