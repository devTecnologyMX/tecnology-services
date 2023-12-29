package com.devtecnologymx.models;


import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    private Long userId;
    private Long rolId;
    private String name;
    private String primaryLastname;
    private String secondaryLastname;
    private String address;
    private String telephone;
    private String nationality;
    private Integer age;
    private LocalDate createDate;
    private String username;
    private String password;
    private Boolean status;
    private LocalDate modifierRoleDate;
    private String modifierRoleUser;
    private Rol rol;

    public User() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRolId() {
        return rolId;
    }

    public void setRolId(Long rolId) {
        this.rolId = rolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrimaryLastname() {
        return primaryLastname;
    }

    public void setPrimaryLastname(String primaryLastname) {
        this.primaryLastname = primaryLastname;
    }

    public String getSecondaryLastname() {
        return secondaryLastname;
    }

    public void setSecondaryLastname(String secondaryLastname) {
        this.secondaryLastname = secondaryLastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public LocalDate getModifierRoleDate() {
        return modifierRoleDate;
    }

    public void setModifierRoleDate(LocalDate modifierRoleDate) {
        this.modifierRoleDate = modifierRoleDate;
    }

    public String getModifierRoleUser() {
        return modifierRoleUser;
    }

    public void setModifierRoleUser(String modifierRoleUser) {
        this.modifierRoleUser = modifierRoleUser;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
