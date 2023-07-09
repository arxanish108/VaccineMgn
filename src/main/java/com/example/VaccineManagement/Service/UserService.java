package com.example.VaccineManagement.Service;


import com.example.VaccineManagement.Models.User;
import com.example.VaccineManagement.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User addUser(User user){
        return userRepository.save(user);
    }
}
