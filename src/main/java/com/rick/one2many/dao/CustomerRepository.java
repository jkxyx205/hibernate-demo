package com.rick.one2many.dao;

import com.rick.one2many.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rick on 5/6/18.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
