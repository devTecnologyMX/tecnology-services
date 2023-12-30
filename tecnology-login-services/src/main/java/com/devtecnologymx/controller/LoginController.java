package com.devtecnologymx.controller;


import com.devtecnologymx.models.Permission;
import com.devtecnologymx.service.PermissionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LoginController {

    @Autowired
    PermissionServiceImpl permissionService;

    @GetMapping("/login")
    public List<Permission> holaMundoIngrato() {

        List<Permission> listarPermisos = new ArrayList<>();
        listarPermisos = permissionService.listarPermission();

        return listarPermisos;

    }
}
