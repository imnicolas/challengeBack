package com.CRUD.challenge.controller;

import com.CRUD.challenge.entity.User;
import com.CRUD.challenge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("traer/usuarios")
    public List<User> getUsuarios() {
        return userService.findUsuarios();
    }

    @GetMapping(path = {"traer/usuario/{id}"})
    public User getUsuarioById (@PathVariable ("id")int id) {
        return userService.findUsuariosById(id);
    }
}
