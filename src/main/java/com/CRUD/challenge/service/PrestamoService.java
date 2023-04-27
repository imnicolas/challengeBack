package com.CRUD.challenge.service;

import com.CRUD.challenge.entity.Prestamo;
import com.CRUD.challenge.repository.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrestamoService {
    @Autowired
    PrestamoRepository prestamoRepository;

    public List<Prestamo> findPrestamo() {
        List<Prestamo> prestamo = prestamoRepository.findAll();
        return prestamo;
    }

}
