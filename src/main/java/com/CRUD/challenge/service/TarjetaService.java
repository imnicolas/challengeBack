package com.CRUD.challenge.service;

import com.CRUD.challenge.entity.Tarjeta;
import com.CRUD.challenge.repository.TarjetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarjetaService {

    @Autowired
    TarjetaRepository tarjetaRepository;
    public List<Tarjeta> findTarjeta() {
        List<Tarjeta> tarjeta = tarjetaRepository.findAll();
        return tarjeta;
    }
    public Tarjeta findTarjetaById(int id) {
        return tarjetaRepository.findById(id).orElse(null);
    }
}
