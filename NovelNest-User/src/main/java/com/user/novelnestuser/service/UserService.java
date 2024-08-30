package com.user.novelnestuser.service;

import com.user.novelnestuser.entity.User;

import java.util.Optional;

public interface UserService {

    User registerUser(User user);

    Optional<User> findByEmail(String email);

    Optional<User> findUserByUsername(String username);

    boolean checkPassword(String rawPassword, String encodedPassword);
}
