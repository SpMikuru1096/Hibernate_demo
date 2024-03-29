package com.iftdemo.hibernate_demo.service;

import com.iftdemo.hibernate_demo.entity.User;
import com.iftdemo.hibernate_demo.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public List<User> findAll() {
        return userRepository.findAll();
    }
    @Transactional
    public void AddUser(User user){
        userRepository.save(user);
    }
    @Transactional
    public void DeleteUser(Long id) {
        if(userRepository.existsById(id)){
            userRepository.deleteById(id);
        }

    }
    @Transactional
    public void UpdateUser(Long id,User updateuser){
        if(userRepository.existsById(id)) {
            updateuser.setId(id);
            userRepository.save(updateuser);
        }
    }
    @Transactional
    public User SearchUser(Long id){
        Optional<User> exitsUser = userRepository.findById(id);
        if(exitsUser.isPresent()) return exitsUser.get();
        else return null;
    }
}
