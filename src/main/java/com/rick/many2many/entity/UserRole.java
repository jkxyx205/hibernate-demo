package com.rick.many2many.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by rick on 5/7/18.
 */
@Entity(name = "user_role")
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"role_id", "user_id"})})
@EntityListeners(AuditingEntityListener.class)
public class UserRole implements Serializable {

    @EmbeddedId
    private UserRoleId userRoleId;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("userId")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("roleId")
    private Role role;

    @CreatedDate
    private Date createDate;


    public UserRole() {}

    public UserRole(User user, Role role) {
        this.role = role;
        this.user = user;
        this.userRoleId = new UserRoleId(user.getId(), role.getId());
    }

    public UserRoleId getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(UserRoleId userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
