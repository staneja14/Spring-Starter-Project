package com.springrest.springrestdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrestdemo.entities.Courses;
import com.springrest.springrestdemo.services.CourseService;

@RestController
public class MyController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/home")
	public String home() {
		return "This is homepage";
	}

	@GetMapping("/courses")
	public List<Courses> getCourses() {
		return this.courseService.getCourses();
	}

	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping(path = "/courses", consumes="application/json")
	public Courses addCourse(@RequestBody Courses course) {
		return this.courseService.addCourse(course);
	}
}
