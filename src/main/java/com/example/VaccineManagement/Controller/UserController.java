package com.example.VaccineManagement.Controller;

import com.example.VaccineManagement.Models.User;
import com.example.VaccineManagement.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/add")
    public User adduser(@RequestBody User user){
          return userService.addUser(user);
    }
}
