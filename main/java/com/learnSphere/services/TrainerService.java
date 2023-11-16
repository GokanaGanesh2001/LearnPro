package com.learnSphere.services;

import java.util.List;

import com.learnSphere.entities.Course;
import com.learnSphere.entities.Lesson;

public interface TrainerService 
{
	String addCourse(Course course);
	String addLesson(Lesson lesson);
	List<Course> viewAllCourses();
	String saveCourse(Course course);

}
