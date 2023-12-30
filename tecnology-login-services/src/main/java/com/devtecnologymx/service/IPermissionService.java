package com.devtecnologymx.service;

import com.devtecnologymx.models.Permission;

import java.util.List;

public interface IPermissionService {

    public List<Permission> listarPermission();

    public void guardar(Permission permission);

    public void eliminar(Permission permission);

    public Permission encontrarPermission(Permission permission);

}
