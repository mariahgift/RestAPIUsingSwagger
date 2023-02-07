package com.mdi.restapiusingswagger.service.course;

import com.mdi.restapiusingswagger.entity.Course;

import java.util.List;

public interface CourseServiceInterface {
    Course addCourse(Course course);
    Course updateCourse(Integer courseId, Course course);
    List<Course> getAllCourses();
    Course getCourseById(Integer courseId);
    void deleteCourse(Integer courseId);
}
