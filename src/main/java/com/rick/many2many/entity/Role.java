package com.rick.many2many.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by rick on 5/6/18.
 */
@Entity
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "role", orphanRemoval = true)
    private Set<UserRole> userSet = new HashSet<>();

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


    public Set<UserRole> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<UserRole> userSet) {
        this.userSet = userSet;
    }
}
