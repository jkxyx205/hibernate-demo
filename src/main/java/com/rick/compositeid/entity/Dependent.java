package com.rick.compositeid.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import java.io.Serializable;

/**
 * Created by rick on 5/7/18.
 */
@Entity
public class Dependent implements Serializable {
    @EmbeddedId
    DependentId id;
    @MapsId("empid")  //  maps the empid attribute of embedded id
    @ManyToOne
    Employee emp;

    public DependentId getId() {
        return id;
    }

    public void setId(DependentId id) {
        this.id = id;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }
}
