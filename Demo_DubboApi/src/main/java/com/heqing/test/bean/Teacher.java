package com.heqing.test.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import com.heqing.utils.TimeUtil;

public class Teacher implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String name;
	private Date birthday;
	private String post;					//岗位
	private Classes superviseClass;			//管理班级
	private Set<Classes> teachClasses;		//授课班级
	private Set<Classes> classDirector;		//班级主任
	
	/**
	 * 获取人物编号
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * 设置人物编号
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * 获取人物姓名
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置人物姓名
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 获取人物出生日期
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * 设置人物出生日期
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	/**
	 * 获取人物年龄
	 * @return the age
	 */
	public int getAge() {
		return TimeUtil.getAge(birthday);
	}

	/**
	 * 获取教师职位
	 * @return the post
	 */
	public String getPost() {
		return post;
	}
	/**
	 * 设置教师师职位
	 * @param post the post to set
	 */
	public void setPost(String post) {
		this.post = post;
	}
	
	/**
	 * 获取教师管理班级
	 * @return the superviseClass
	 */
	public Classes getSuperviseClass() {
		return superviseClass;
	}
	/**
	 * 设置教师管理班级
	 * @param superviseClass the superviseClass to set
	 */
	public void setSuperviseClass(Classes superviseClass) {
		this.superviseClass = superviseClass;
	}
	
	/**
	 * 获取教师授课班级
	 * @return the teachClasses
	 */
	public Set<Classes> getTeachClasses() {
		return teachClasses;
	}
	/**
	 * 设置教师授课班级
	 * @param teachClasses the teachClasses to set
	 */
	public void setTeachClasses(Set<Classes> teachClasses) {
		this.teachClasses = teachClasses;
	}
	
	/**
	 * 获取教师管理
	 * @return the classDirector
	 */
	public Set<Classes> getClassDirector() {
		return classDirector;
	}
	/**
	 * 设置教师管理
	 * @param classDirector the classDirector to set
	 */
	public void setClassDirector(Set<Classes> classDirector) {
		this.classDirector = classDirector;
	}

}
