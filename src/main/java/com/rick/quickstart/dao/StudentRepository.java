package com.rick.quickstart.dao;

import com.rick.quickstart.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rick on 5/5/18.
 */
public interface StudentRepository extends JpaRepository<Student, Long>{
}
