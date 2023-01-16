package org.Person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCreateBook {

    public Book bookObject() {
        return new Book("Títol del Llibre", 333, "273651987638B", new Author("Joan", "Pere", 77));
    }

    @Test
    public void toStringTest() {
        String espected = "\n Títol: Títol del Llibre - Pàgines: 333 - ISBN: 273651987638B - Autor: Joan";
        String actual = bookObject().toString();
        Assertions.assertEquals(espected, actual);
    }

    @Test
    void getPagesTest() {
        int espected = 333;
        int actual = bookObject().getPages();
        Assertions.assertEquals(espected, actual);
    }

    @Test
    void setPagesTest() {
        Book book1 = bookObject();
        book1.setPages(222);
        int espected = 222;
        int actual = book1.getPages();
        Assertions.assertEquals(espected, actual);
    }

    @Test
    void setAuthorTest() {
        Book book1 = bookObject();
        Author newAuthor = new Author("Manel", "Boll", 33);
        book1.setAuthor(newAuthor);
        Assertions.assertEquals(newAuthor,book1.getAuthor());
    }

}
