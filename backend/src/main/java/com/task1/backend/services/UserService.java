package com.task1.backend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.task1.backend.DTO.UserLoginDto;
import com.task1.backend.DTO.UserRegistrationDto;
import com.task1.backend.model.UserEntity;
import com.task1.backend.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserEntity registerUser(UserRegistrationDto userRegistrationDto) {
        System.out.println("Registering user: " + userRegistrationDto.getUsername());
        UserEntity user = new UserEntity();
        user.setName(userRegistrationDto.getName());
        user.setUsername(userRegistrationDto.getUsername());
        user.setEmail(userRegistrationDto.getEmail());
        user.setAge(userRegistrationDto.getAge());
        String encodedPassword = passwordEncoder.encode(userRegistrationDto.getPassword());
        System.out.println("Encoded password: " + encodedPassword);
        user.setPassword(encodedPassword);
        user.setRole("USER");
        UserEntity savedUser = userRepository.save(user);
        System.out.println("User saved: " + savedUser.getUsername());
        return savedUser;
    }

    public Optional<UserEntity> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public boolean authenticateUser(UserLoginDto userLoginDto) {
        Optional<UserEntity> userOptional = userRepository.findByUsername(userLoginDto.getUsername());
        if (userOptional.isPresent()) {
            UserEntity user = userOptional.get();
            return passwordEncoder.matches(userLoginDto.getPassword(), user.getPassword());
        }
        return false;
    }

}
