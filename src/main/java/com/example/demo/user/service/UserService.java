package com.example.demo.user.service;

import com.example.demo.user.db.UserRepository;
import com.example.demo.user.model.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    public UserEntity save(UserEntity user) {
        //save
        return userRepository.save(user);
    }

    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    public void delete(Long id) {
        userRepository.delete(id);
    }

    public UserEntity findOne(Long id) {
        return userRepository.findById(id).get();
    }
}
