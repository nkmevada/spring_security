package org.nk.jdbc_authentication.controller;

import org.nk.jdbc_authentication.model.Users;
import org.nk.jdbc_authentication.service.RegisterUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegisterUserController {
    @Autowired
    RegisterUserService registerUserService;

    @PostMapping("/regsterUser")
    public ResponseEntity<String> saveStudent(@RequestBody Users users){
        registerUserService.save(users);
        return ResponseEntity.ok().body(users.toString());
    }

    @GetMapping("/regsterUser")
    public ResponseEntity<List<Users>> getAllUsers() {
        return new ResponseEntity<>(registerUserService.getAllUsers(), HttpStatus.OK);
    }
}
