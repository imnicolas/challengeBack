package com.CRUD.challenge.service;

import com.CRUD.challenge.entity.Menu;
import com.CRUD.challenge.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    MenuRepository menuRepository;

    public List<Menu> findMenu() {
        return menuRepository.findAll();
    }
}
