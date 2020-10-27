package com.example.govtservice.service;

import com.example.govtservice.model.User;
import com.example.govtservice.model.mapper.UserMapper;
import com.example.govtservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GovernmentService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return UserMapper.map(userRepository.save(UserMapper.map(user)));
    }

    public User getUser(String userId) {
        Optional<com.example.govtservice.repository.dto.User> userOptional = userRepository.findById(userId);
        if(userOptional.isEmpty())
            return null;
        return UserMapper.map(userOptional.get());
    }
}
