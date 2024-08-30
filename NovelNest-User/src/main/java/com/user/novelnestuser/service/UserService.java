package com.user.novelnestuser.service;



import com.entity.novelnestentity.User;

import java.util.Optional;

public interface UserService {

    User registerUser(User user);

    Optional<User> findByEmail(String email);

    Optional<User> findUserByUsername(String username);

}
