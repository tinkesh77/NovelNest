package com.admin.novelnestadmin.services;


import com.entity.novelnestentity.User;
import com.user.novelnestuser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public ResponseEntity<String> delete(Long userId){
        if (userRepository.existsById(userId)){
            userRepository.deleteById(userId);
        }else {
            return new ResponseEntity<>("user does not exist" , HttpStatus.NOT_FOUND);
        }
        return  new ResponseEntity<>("user deleted" , HttpStatus.OK);
    }

    public void deleteAll(){
        userRepository.deleteAll();
    }

    public void restrict(Long userId){
        if (userRepository.existsById(userId)){
            User user = userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("Invalid User"));
//            user.setEnabled(fa
            userRepository.save(user);
        }
    }
}
