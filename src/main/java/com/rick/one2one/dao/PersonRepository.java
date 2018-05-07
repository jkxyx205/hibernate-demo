package com.rick.one2one.dao;

import com.rick.one2one.entity.IdCard;
import com.rick.one2one.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rick on 5/6/18.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
}
