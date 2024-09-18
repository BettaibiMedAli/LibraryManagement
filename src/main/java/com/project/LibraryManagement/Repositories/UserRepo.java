package com.project.LibraryManagement.Repositories;

import com.project.LibraryManagement.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
