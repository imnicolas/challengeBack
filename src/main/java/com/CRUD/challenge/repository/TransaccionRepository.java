package com.CRUD.challenge.repository;

import com.CRUD.challenge.entity.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaccionRepository extends JpaRepository<Transaccion,Integer> {
}
