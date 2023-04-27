package com.CRUD.challenge.service;

import com.CRUD.challenge.entity.Transaccion;
import com.CRUD.challenge.repository.TransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransaccionService {
    @Autowired
    TransaccionRepository transaccionRepository;

    public Transaccion findTransaccionById (int id) {
        Transaccion transaccion = transaccionRepository.findById(id).orElse(null);
        return transaccion;
    }
    public List<Transaccion> findTransaccion() {
        List<Transaccion> transaccion = transaccionRepository.findAll();
        return transaccion;
    }
}
