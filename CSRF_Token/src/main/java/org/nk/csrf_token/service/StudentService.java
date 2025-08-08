package org.nk.csrf_token.service;

import org.nk.csrf_token.model.Student;
import org.nk.csrf_token.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
       return studentRepository.findAll();
    }

    public void saveStudents(Student student) {
        studentRepository.save(student);
    }
}
