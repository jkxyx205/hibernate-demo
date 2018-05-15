package com.rick.map.dao;

import com.rick.map.entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rick on 5/14/18.
 */
public interface NoticeRepository extends JpaRepository<Notice, Long> {
}
