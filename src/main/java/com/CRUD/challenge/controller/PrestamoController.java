package com.CRUD.challenge.controller;

import com.CRUD.challenge.entity.Prestamo;
import com.CRUD.challenge.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class PrestamoController {
    @Autowired
    PrestamoService prestamoService;

    // GetMapping getPrestamo
    @GetMapping(path = {"traer/prestamos"})
    public List<Prestamo> getPrestamo () {
        return prestamoService.findPrestamo();
    }
}
