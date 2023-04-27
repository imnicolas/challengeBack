package com.CRUD.challenge.controller;

import com.CRUD.challenge.entity.Balance;
import com.CRUD.challenge.service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class BalanceController {

    @Autowired
    BalanceService balanceService;

    @GetMapping(path = {"traer/balances"})
    public List<Balance> getBalanceById() {
        return balanceService.findBalance();
    }


}
