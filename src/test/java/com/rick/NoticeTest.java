package com.rick;

import com.rick.map.dao.NoticeRepository;
import com.rick.map.dao.TagRepository;
import com.rick.map.entity.Notice;
import com.rick.map.entity.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

/**
 * Created by rick on 5/14/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class NoticeTest {

    @Autowired
    private NoticeRepository noticeRepository;

    @Autowired
    private TagRepository tagRepository;

    @Test
    public void testAdd() {
        Tag tag = new Tag();
        tag.setTitle("BAD");
        tagRepository.save(tag);

        Tag tag2 = new Tag();
        tag2.setTitle("BAD");
        tagRepository.save(tag2);

        Notice notice = new Notice();
        notice.setTitle("Java In Action");
        notice.getTags().put(tag.getTitle(), tag);
        notice.getTags().put(tag.getTitle(), tag2);
        noticeRepository.save(notice);
    }

    @Test
    @Transactional
    public void testQuery() {
        Notice notice = noticeRepository.findById(8L).get();

        System.out.println("-----------> " + notice.getTags().get("BAD").getId());
    }
}
