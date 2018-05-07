package com.rick.compositeid.dao;

import com.rick.compositeid.entity.Label;
import com.rick.compositeid.entity.LabelKey;
import com.rick.compositeid.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rick on 5/5/18.
 */
public interface TaskRepository extends JpaRepository<Task, Long> {
}
