package org.nk.jdbc_authentication.service;

import org.nk.jdbc_authentication.model.Users;
import org.nk.jdbc_authentication.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterUserService {
    @Autowired
    UserRepo userRepo;

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public void save(Users users) {
        users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
        userRepo.save(users);
    }

    public List<Users> getAllUsers() {
        return userRepo.findAll();
    }
}
