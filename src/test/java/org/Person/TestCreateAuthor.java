package org.Person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestCreateAuthor {

    public Author authorObject() {
        return new Author("Sergi", "Aznale", 39);
    }

    @Test
    public void getFirstNameTest() {
        Author author = authorObject();
        Assertions.assertEquals("Sergi", author.getFirstName());
    }

    @Test
    public void getLastNameTest() {
        Author author = authorObject();
        Assertions.assertEquals("Aznale", author.getLastName());
    }

    @Test
    public void getAgeTest() {
        Author author = authorObject();
        Assertions.assertEquals(39, author.getAge());
    }


}
