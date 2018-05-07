package com.rick.compositeid.dao;

import com.rick.compositeid.entity.Label;
import com.rick.compositeid.entity.LabelKey;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rick on 5/5/18.
 */
public interface LabelRepository extends JpaRepository<Label, LabelKey> {
}
