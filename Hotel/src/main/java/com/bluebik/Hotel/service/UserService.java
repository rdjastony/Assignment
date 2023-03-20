package com.bluebik.Hotel.service;


import com.bluebik.Hotel.entity.User;
import com.bluebik.Hotel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User saveUser(User user){
       return repository.save(user);
    }

    public List<User> saveUsers(List<User> users) {
        return repository.saveAll(users);
    }

    public List<User> getUsers(){
        return repository.findAll();
    }

    public User getUsersById(int id){
        return repository.findById(id).orElse(null);
    }

    public User getUsersByName(String name){
        return repository.findByName(name);
    }

    public String deleteUser(int id){
        repository.deleteById(id);
        return "User Removed!!"+id;
    }

    public User updateUser(User user){
        User existingUser=repository.findById(user.getId()).orElse(null);
        existingUser.setName(user.getName());
        existingUser.setAge(user.getAge());
        existingUser.setNumber(user.getNumber());
        return repository.save(existingUser);
    }










}
