package com.springrest.springrestdemo.services;

import java.util.List;

import com.springrest.springrestdemo.entities.Courses;

public interface CourseService {
	
	

	public List<Courses> getCourses();
	
	public Courses getCourse(long CourseId);

    public Courses addCourse(Courses course);

}
