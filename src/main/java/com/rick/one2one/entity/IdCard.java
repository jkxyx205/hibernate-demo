package com.rick.one2one.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by rick on 5/6/18.
 */
@Entity
public class IdCard implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String sno;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", unique = true) //可选，如果不写是person_id
    @MapsId
    private Person person;

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

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
