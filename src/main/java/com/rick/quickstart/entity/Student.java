package com.rick.quickstart.entity;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by rick on 5/5/18.
 */
@Entity
@Table(name="t_student")
@EntityListeners(AuditingEntityListener.class)
@DynamicUpdate
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "名字不能为空")
    @Column(name="name", nullable = false, unique = true, length = 32)
    private String name;

    @Column(columnDefinition = "text")
    private String description;

    private Byte[] image;

    private Integer age;

    private Float salary;

    private Boolean married;

    private Character sex;

    @Enumerated(EnumType.STRING)
    private Location location;

    @CreatedDate
    @Column(name = "create_date")
    private Date createDate;

    @CreatedBy
    @Column(name = "create_by")
    private Integer createBy;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public static enum Location {
        JS,SC,SX
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    @PrePersist
    @PreUpdate
    public void prePersist() {
        System.out.println("---------PrePersist--------");
    }
}