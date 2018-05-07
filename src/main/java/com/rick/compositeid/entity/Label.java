package com.rick.compositeid.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by rick on 5/5/18.
 */
@Entity(name = "label")
public class Label implements Serializable {

    @EmbeddedId
    private LabelKey labelKey;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", updatable = false, insertable = false)
    @MapsId("categoryId")
    private Task task;

    private String title;

    public LabelKey getLabelKey() {
        return labelKey;
    }

    public void setLabelKey(LabelKey labelKey) {
        this.labelKey = labelKey;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
