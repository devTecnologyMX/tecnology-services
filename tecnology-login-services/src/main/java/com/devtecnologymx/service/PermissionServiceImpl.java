package com.devtecnologymx.service;

import com.devtecnologymx.models.Permission;
import com.devtecnologymx.repository.IPermissionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    IPermissionDAO iPermissionDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Permission> listarPermission() {
        return (List<Permission>) iPermissionDAO.findAll();
    }

    @Override
    @Transactional
    public void guardar(Permission permission) {
        iPermissionDAO.save(permission);
    }

    @Override
    @Transactional
    public void eliminar(Permission permission) {
        iPermissionDAO.delete(permission);
    }

    @Override
    @Transactional(readOnly = true)
    public Permission encontrarPermission(Permission permission) {
        return iPermissionDAO.findById(permission.getPermissionId()).orElse(null);
    }

}
