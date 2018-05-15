package com.rick.map.entity;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rick on 5/14/18.
 */
@Entity
@Table
public class Notice {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToMany
    @JoinTable(
            name="notice_tag",
            joinColumns={@JoinColumn(name="notice_Id", referencedColumnName="id")},
            inverseJoinColumns={@JoinColumn(name="tag_id", referencedColumnName="id")})
    @MapKey(name = "title")
    private Map<String, Tag> tags = new HashMap<>();


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

    public Map<String, Tag> getTags() {
        return tags;
    }

    public void setTags(Map<String, Tag> tags) {
        this.tags = tags;
    }
}
