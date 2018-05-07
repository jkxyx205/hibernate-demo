package com.rick.many2many.dao;

import com.rick.many2many.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rick on 5/6/18.
 */
public interface UserRepository extends JpaRepository<User, Long>{
}
