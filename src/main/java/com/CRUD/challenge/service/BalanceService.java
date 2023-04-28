package com.CRUD.challenge.service;

import com.CRUD.challenge.entity.Balance;
import com.CRUD.challenge.repository.BalanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BalanceService {
    @Autowired
    BalanceRepository balanceRepository;

    public List<Balance> findBalance() {
        List<Balance> balance = balanceRepository.findAll();
        return balance;
    }

    public Balance findBalanceById(int id) {
        return balanceRepository.findById(id).orElse(null);
    }

}
