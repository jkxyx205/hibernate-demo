package com.rick;

import com.rick.one2one.dao.IdCardRepository;
import com.rick.one2one.dao.PersonRepository;
import com.rick.one2one.entity.IdCard;
import com.rick.one2one.entity.Person;
import com.rick.quickstart.dao.AuthorRepository;
import com.rick.quickstart.dao.BookRepository;
import com.rick.quickstart.entity.Author;
import com.rick.quickstart.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * Created by rick on 5/6/18.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleTest {
    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void add() {
        Book book = new Book();
        book.setName("Java");
        book.setIsbn("998223");

        Author author = new Author();
        author.setName("King");
        author.setAge(10);
        author.getBookSet().add(book);
        authorRepository.save(author);
    }

    @Test
    public void add2() {
        Book book = new Book();
        book.setName("Php");
        book.setIsbn("998223");


        Author author = new Author();
        author.setName("Jim");
        author.setAge(10);

        book.setAuthor(author);

//        authorRepository.save(author);
        bookRepository.save(book);
    }

    @Test
    public void add3() {
        Book book = new Book();
        book.setName("C++");
        book.setIsbn("998223");


        Author author = new Author();
        author.setName("Tom");
        author.setAge(10);
        //相互关联
        book.setAuthor(author);
        author.getBookSet().add(book);

        authorRepository.save(author);
    }


    @Test
    @Transactional
    public void find() { //懒加载要在在事务中才能运行
        Author author = authorRepository.findById(1L).get();

        System.out.println(author.getBookSet().size());
//        System.out.println(author.getName());
//        System.out.println(author.getBookSet().iterator().next().getName());
//
//        author.setName("Lucy"); //不会被更新

    }


}
