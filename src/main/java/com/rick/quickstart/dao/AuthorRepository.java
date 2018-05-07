package com.rick.quickstart.dao;

import com.rick.quickstart.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rick on 5/7/18.
 */
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
