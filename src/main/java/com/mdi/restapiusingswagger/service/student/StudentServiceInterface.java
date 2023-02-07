package com.mdi.restapiusingswagger.service.student;

import com.mdi.restapiusingswagger.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentServiceInterface {
    List<Student> getAllStudents();
    Optional<Student> findStudentById(int studentId);
    Student addStudent(Student student);
    Student updateById(int studentId, Student student);
    void deleteById(int studentId);
//    Optional<Student> enroll(int courseId);
//    Optional<Student> drop(int courseId);

}
