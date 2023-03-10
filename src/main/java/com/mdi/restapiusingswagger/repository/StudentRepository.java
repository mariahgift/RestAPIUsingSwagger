package com.mdi.restapiusingswagger.repository;

import com.mdi.restapiusingswagger.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
