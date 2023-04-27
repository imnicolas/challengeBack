package com.CRUD.challenge.controller;

import com.CRUD.challenge.entity.Transaccion;
import com.CRUD.challenge.service.TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class TransaccionController {
    @Autowired
    TransaccionService transaccionService;

    @GetMapping(path = {"traer/transacciones/{id}"})
    public Transaccion getTransaccionById(@PathVariable ("id") int id) {
        return transaccionService.findTransaccionById(id);
    }

    @GetMapping("traer/transacciones")
    public List<Transaccion> getTransaccion() {
        return transaccionService.findTransaccion();
    }
}
