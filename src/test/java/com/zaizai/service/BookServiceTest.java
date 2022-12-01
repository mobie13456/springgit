package com.zaizai.service;


import com.zaizai.config.SpringConfig;
import com.zaizai.dao.BookDao;
import com.zaizai.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {
    @Autowired
    private BookService bookDao;
    @Test
    public void getByid(){

        System.out.println( bookDao.selectAll());

    }
    @Test
    public void insert(){
        Book book = new Book(1,"jisuanji","zaizai","zaizaidesu");

        System.out.println( bookDao.save(book));

    }
    @Test
    public void delete(){
        Book book = new Book(1,"jisuanji","zaizai","zaizaidesu");

        System.out.println( bookDao.delete(13));

    }
}

