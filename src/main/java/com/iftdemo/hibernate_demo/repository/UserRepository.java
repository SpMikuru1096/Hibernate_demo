package com.iftdemo.hibernate_demo.repository;

import com.iftdemo.hibernate_demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAll();
}
