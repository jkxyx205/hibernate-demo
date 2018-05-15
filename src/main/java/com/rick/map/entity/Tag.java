package com.rick.map.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rick on 5/14/18.
 */
@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToMany(mappedBy = "tags")
    private List<Notice> notices = new ArrayList<>();

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

    public List<Notice> getNotices() {
        return notices;
    }

    public void setNotices(List<Notice> notices) {
        this.notices = notices;
    }
}
