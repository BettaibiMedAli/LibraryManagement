package com.project.LibraryManagement.Services;

import com.project.LibraryManagement.Models.User;
import com.project.LibraryManagement.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<User> findAll()
    {
        return userRepo.findAll();
    }

    public User save(User user)
    {
        return userRepo.save(user);
    }
}
