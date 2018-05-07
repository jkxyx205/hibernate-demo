package com.rick.quickstart.dao;

import com.rick.quickstart.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rick on 5/7/18.
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}
