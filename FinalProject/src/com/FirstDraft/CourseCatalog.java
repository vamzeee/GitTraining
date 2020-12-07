package com.FirstDraft;

import java.util.List;
import java.util.HashMap;

public class CourseCatalog implements CourseInterface{
	
	HashMap<Course, Integer> courseMap;
	
	CourseCatalog(){
		courseMap = new HashMap<>();
	}
	
	@Override
	public void addCourse(Course e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCourse(Course e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCourse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Course> showCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> showCourses(String courseName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> showCourses(Employee trainer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> showMyCourses() {
		// TODO Auto-generated method stub
		return null;
	}
}
