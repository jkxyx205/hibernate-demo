package com.rick.many2many.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by rick on 5/6/18.
 */
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Transient
    private List<Role> roleList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER,  mappedBy = "user", orphanRemoval = true)
    private Set<UserRole> userRoleSet = new HashSet<>();

    public List<Role> getRoleList() {
        return roleList;
    }

    public void build() {
        for (Role role:  roleList) {
            UserRole userRole = new UserRole(this, role);
            userRoleSet.add(userRole);
        }
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Set<UserRole> getUserRoleSet() {
        return userRoleSet;
    }

    public void setUserRoleSet(Set<UserRole> userRoleSet) {
        this.userRoleSet = userRoleSet;
    }
}
