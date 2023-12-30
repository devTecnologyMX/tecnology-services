package com.devtecnologymx.repository;

import com.devtecnologymx.models.Permission;
import org.springframework.data.repository.CrudRepository;

public interface IPermissionDAO extends CrudRepository<Permission, Long> {

}
