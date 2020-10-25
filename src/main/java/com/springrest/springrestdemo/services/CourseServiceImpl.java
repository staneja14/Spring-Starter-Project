package com.springrest.springrestdemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrestdemo.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService {

	List<Courses> list;

	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Courses(546, "Requirements", "Req. Analysis"));
		list.add(new Courses(547, "Software Architecture", "Architecture"));
	}

	@Override
	public List<Courses> getCourses() {
		return list;
	}

	@Override
	public Courses getCourse(long courseId) {

		Courses c = null;
		for (Courses course : list) {
			if (course.getId() == courseId) {
				c = course;
				break;
			}
		}

		return c;
	}

	@Override
	public Courses addCourse(Courses course) {
		list.add(course);
		return course;
	}

}
