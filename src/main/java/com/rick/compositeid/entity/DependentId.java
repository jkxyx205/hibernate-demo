package com.rick.compositeid.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by rick on 5/7/18.
 */
@Embeddable
public class DependentId implements Serializable {
    String name;
    long empid;   // corresponds to primary key type of Employee

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getEmpid() {
        return empid;
    }

    public void setEmpid(long empid) {
        this.empid = empid;
    }
}