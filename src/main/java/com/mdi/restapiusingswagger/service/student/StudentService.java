package com.mdi.restapiusingswagger.service.student;

import com.mdi.restapiusingswagger.entity.Student;
import com.mdi.restapiusingswagger.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements StudentServiceInterface{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    @Override
    public Optional<Student> findStudentById(int studentId) {
        return studentRepository.findById(studentId);
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateById(int studentId, Student student) {
        Student studentOriginal = studentRepository.findById(studentId).orElseThrow();
        studentOriginal.setFirstName(student.getFirstName());
        studentOriginal.setLastName(student.getLastName());
        studentOriginal.setEmail(student.getEmail());
        studentOriginal.setBirthday(student.getBirthday());
        studentOriginal.setLevel(student.getLevel());
        return studentRepository.save(studentOriginal);
    }

    @Override
    public void deleteById(int studentId) {
        studentRepository.deleteById(studentId);
    }


}
