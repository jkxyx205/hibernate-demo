package com.rick.compositeid.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by rick on 5/5/18.
 */
@Embeddable
public class LabelKey implements Serializable {
    private String category;

    @Column(name = "category_id")
    private Long categoryId;


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
