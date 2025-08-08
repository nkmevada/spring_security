package org.nk.csrf_token.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.nk.csrf_token.model.Student;
import org.nk.csrf_token.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }

    @PostMapping("/students")
    public ResponseEntity<String> saveStudents(@RequestBody Student student) {
        studentService.saveStudents(student);
        return new ResponseEntity<>("Data saved successfully", HttpStatus.OK);
    }

    @GetMapping("/csrfToken")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
