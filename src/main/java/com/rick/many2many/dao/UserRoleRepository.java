package com.rick.many2many.dao;

import com.rick.many2many.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rick on 5/7/18.
 */
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
}
