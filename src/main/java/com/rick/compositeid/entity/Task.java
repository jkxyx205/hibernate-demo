package com.rick.compositeid.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by rick on 5/5/18.
 */
@Entity(name = "task")
public class Task implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER, mappedBy="task")
    private List<Label> labelList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Label> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<Label> labelList) {
        this.labelList = labelList;
    }
}
