package com.mdi.restapiusingswagger.repository;

import com.mdi.restapiusingswagger.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
