package com.mdi.restapiusingswagger.controller;

import com.mdi.restapiusingswagger.entity.Course;
import com.mdi.restapiusingswagger.service.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/getCourses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/getCourseById/{courseId}")
    public Course getCourseById(@PathVariable Integer courseId) {
        return courseService.getCourseById(courseId);
    }

    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @PutMapping("/updateCourse/{courseId}")
    public Course updateCourse(@PathVariable Integer courseId, @RequestBody Course course) {
        course.setCourseId(courseId);
        return courseService.updateCourse(courseId, course);
    }

    @DeleteMapping("/deleteCourse/{courseId}")
    public void deleteCourse(@PathVariable Integer courseId) {
        courseService.deleteCourse(courseId);
    }
}
