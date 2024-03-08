package com.user_services.Userservices.Services.impl;

import com.user_services.Userservices.Entity.User;
import com.user_services.Userservices.Repository.UserRepository;
import com.user_services.Userservices.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        String ramdomUserId= UUID.randomUUID().toString();
        user.setUserId(ramdomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()-> new ResourceAccessException("User id is not found "+userId));
    }
}
