package com.project.LibraryManagement.Controllers;

import com.project.LibraryManagement.Models.User;
import com.project.LibraryManagement.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping
    public List<User> getAllUsers()
    {
        return userRepo.findAll();
    }

    @PostMapping
    public User addUser(@RequestBody User user)
    {
        return userRepo.save(user);
    }
}
