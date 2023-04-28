package com.CRUD.challenge.controller;

import com.CRUD.challenge.entity.Menu;
import com.CRUD.challenge.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class MenuController {
    @Autowired
    MenuService menuService;

    @GetMapping("traer/menu")
    public List<Menu> getMenu() {
        return menuService.findMenu();
    }
}
