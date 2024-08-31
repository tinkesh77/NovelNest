package com.admin.novelnestadmin.controllers;


import com.admin.novelnestadmin.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class UserContoller {
    // api end points
    // delete user. /admin/users/{userId}
    // delete all users. DELETE /admin/users
    // restrict user. /admin/users/{userId}/restrict
    // send notification to user. /admin/users/{userId}/notify
    // send notification to all user. /admin/users/notify
    // view user details. /admin/users/{userId}

    @Autowired
    private UserService userService;

    @DeleteMapping("/users/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable Long userId){
        return userService.delete(userId);
    }
    @DeleteMapping("/users")
    public void deleteUserAll(){
        userService.deleteAll();
    }

    @PostMapping("users/restrict/{userId}")
    public void restrictUser(@PathVariable Long userId){
        userService.restrict(userId);
    }

}
