package com.user.novelnestuser.service.impl;


import com.user.novelnestuser.repository.UserRepository;
import com.user.novelnestuser.service.UserService;
import com.entity.novelnestentity.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private  UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public Optional<User> findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}
