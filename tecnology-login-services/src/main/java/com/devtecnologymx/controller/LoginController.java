package com.devtecnologymx.controller;


import com.devtecnologymx.models.Permission;
import com.devtecnologymx.models.Rol;
import com.devtecnologymx.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LoginController {

    @GetMapping("/login")
    public User helloWorld() {

        List<Permission> permissions = new ArrayList<>();
        Permission permission = new Permission();
        permission.setPermission("Insertar");
        permissions.add(permission);

        Rol rol = new Rol();
        rol.setTypeRol("Administrador");
        rol.setPermissionList(permissions);

        User user = new User();
        user.setName("Raul");
        user.setAge(28);
        user.setNationality("Mexico");
        user.setRol(rol);

        return user;

    }
}
