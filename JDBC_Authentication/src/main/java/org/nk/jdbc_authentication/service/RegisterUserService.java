package org.nk.jdbc_authentication.service;

import org.nk.jdbc_authentication.model.Users;
import org.nk.jdbc_authentication.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterUserService {
    @Autowired
    UserRepo userRepo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public void save(Users users) {
        users.setPassword(encoder.encode(users.getPassword()));
        userRepo.save(users);
    }

    public List<Users> getAllUsers() {
        return userRepo.findAll();
    }
}
