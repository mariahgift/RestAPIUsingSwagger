package com.mdi.restapiusingswagger.controller;

import com.mdi.restapiusingswagger.entity.Student;
import com.mdi.restapiusingswagger.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping(path = "/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("/getStudents")
    public List<Student> findAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/getStudentById/{studentId}")
    public Optional<Student> findStudentById(@PathVariable int studentId) {
        return studentService.findStudentById(studentId);
    }

    @PutMapping("/updateStudent/{studentId}")
    public Student updateById(@PathVariable int studentId, @RequestBody Student student) {
        student.setStudentId(studentId);
        return studentService.updateById(studentId, student);
    }

    @DeleteMapping("/deleteStudent/{studentId}")
    public void deleteById(@PathVariable int studentId) {
        studentService.deleteById(studentId);
    }


}
