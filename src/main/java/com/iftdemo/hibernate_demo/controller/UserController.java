package com.iftdemo.hibernate_demo.controller;


import com.iftdemo.hibernate_demo.entity.User;
import com.iftdemo.hibernate_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/all")
    public List<User> getAll() {
        return userService.findAll();
    }
    @GetMapping("/{id}")
    public User SearchUser(@PathVariable Long id) {
        return userService.SearchUser(id);
    }

    @PostMapping("/add")
    public void AddUser(@RequestBody User user){
        userService.AddUser(user);
    }
    @DeleteMapping("/{id}")
    public void DeleteUser(@PathVariable Long id) {
         userService.DeleteUser(id);
    }

    @PutMapping("/{id}")
    public void UpdateUser(@PathVariable Long id, @RequestBody User updateuser){
        userService.UpdateUser(id,updateuser);
    }

}
