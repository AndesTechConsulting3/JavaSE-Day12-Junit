package org.andestech.learning.rfb18.g2;

import static org.junit.Assert.assertTrue;

import org.andestech.learning.rfb19.g3.Book;
import org.junit.Assert;
import org.junit.Test;


public class BookTest
{

    @Test
    public void notNullBookTest()
    {
        Book book = null;

        book = new Book(1869,"GG-864876","Лев Толстой","Война и Мир");
        Assert.assertNotNull(book);

    }

    @Test
    public void bookDataTest()
    {

        Book book = new Book(1869,"GG-864876","Лев Толстой","Война и Мир");

        Assert.assertEquals(1869, book.getYear());
        Assert.assertEquals("GG-864876", book.getIsbn());
        Assert.assertEquals("Война и Мир", book.getTitle());
        //......
        //......

    }




}
