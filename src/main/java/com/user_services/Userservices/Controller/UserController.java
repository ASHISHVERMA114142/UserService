package com.user_services.Userservices.Controller;

import com.user_services.Userservices.Entity.User;
import com.user_services.Userservices.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/add")
    public ResponseEntity<User> createUser(@RequestBody  User user){
        User user1=userService.saveUser(user);
        return new ResponseEntity<>(user1, HttpStatus.OK);
    }
    @GetMapping("/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable String userId){
        User user =userService.getUser(userId);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }
    @GetMapping("/getAll")
    public  ResponseEntity<List<User>> getAllUser(){
        List<User> allUser=userService.getAllUser();
        return new ResponseEntity<>(allUser,HttpStatus.OK);
    }

}
