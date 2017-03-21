package com.heqing.test.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.heqing.test.bean.Classes;
import com.heqing.test.bean.Teacher;
import com.heqing.test.service.ClassesService;
import com.heqing.test.service.TeacherService;
import com.heqing.utils.JsonUtil;

@Controller
public class TestController {
	
	private static final Logger logger = Logger.getLogger(TestController.class);
	
	@Autowired
	private ClassesService classesService;

	@Autowired
	private TeacherService teacherService;
	
	@RequestMapping("/getClasses")
	public void getClasses(HttpServletResponse response, HttpServletRequest request,Model model) {
		int currentPage = 1;  //当前页
		int pageSize = 3;	  //每页显示5条数据
		int size = classesService.findAll(null).size();	//总共的数据数量
		List<Classes> list = new ArrayList<Classes>();
		for(Classes classes: classesService.getPageBean(null, (currentPage-1)*pageSize, pageSize)) {
			list.add(Classes.getClasses(classes));
		}
		
		Map<String,Object> paramsMap=new LinkedHashMap<String,Object>();
		paramsMap.put("classesSize",size);
		paramsMap.put("classesList", list);
		JsonUtil.outputJsonMessage(logger, "getClasses", response, paramsMap);
	}
	
	@RequestMapping("/getTeacher")
	public void getTeacher(HttpServletResponse response, HttpServletRequest request,Model model) {
		Map<String,Object> paramsMap=new LinkedHashMap<String,Object>();
		Teacher teacher = (Teacher)teacherService.getById(1l);
		paramsMap.put("teacher", teacher.getName());
		JsonUtil.outputJsonMessage(logger, "getTeacher", response, paramsMap);
	}
}
