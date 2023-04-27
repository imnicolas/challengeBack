package com.CRUD.challenge.controller;

import com.CRUD.challenge.entity.Tarjeta;
import com.CRUD.challenge.service.TarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class TarjetaController {

    @Autowired
    TarjetaService tarjetaService;

    @GetMapping("traer/tarjetas")
    public List<Tarjeta> getTarjeta() {
        return tarjetaService.findTarjeta();
    }
}
