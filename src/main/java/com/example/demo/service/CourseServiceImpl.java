package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseDao;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	public CourseDao courseDao;

	@Override
	public List<Course> getCourses() {

		return courseDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(Long courseId) {

		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	public void deleteCourse(Long courseId) {

		@SuppressWarnings("deprecation")
		Course courseEntity = courseDao.getOne(courseId);
		courseDao.delete(courseEntity);
	}

}
