package org.nk.custom_config_sft.controller;

import org.nk.csrf_token.model.Student;
import org.nk.custom_config_sft.service.StudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/edu")
public class StudController {
    @Autowired
    StudService studService;

    @PostMapping("/students")
    public ResponseEntity<String> saveStudents(@RequestBody Student student) {
        studService.saveStudents(student);
        return new ResponseEntity<>("Data saved successfully", HttpStatus.OK);
    }
}
