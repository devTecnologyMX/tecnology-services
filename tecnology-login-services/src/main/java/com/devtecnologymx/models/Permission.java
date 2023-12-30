package com.devtecnologymx.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="permission")
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="permission_id")
    private Long permissionId;
    private String permission;
    private String description;
    private String screen_name;

    @Column(name="rol_id")
    private Long rolId;

}
