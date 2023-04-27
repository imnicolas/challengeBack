package com.CRUD.challenge.service;

import com.CRUD.challenge.entity.User;
import com.CRUD.challenge.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> findUsuarios() {
        List<User> usuario = userRepository.findAll();
        return usuario;
    }

    public User findUsuariosById(int id) {
        User user = userRepository.findById(id).orElse(null);
        return user;
    }
}
