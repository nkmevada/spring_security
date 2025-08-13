package org.nk.custom_config_sft.service;

import org.nk.csrf_token.model.Student;
import org.nk.csrf_token.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudService {
    @Autowired
    StudentRepository studRepository;
    public void saveStudents(Student student) {
        studRepository.save(student);
    }
}
