package org.Person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.github.javafaker.Faker;


public class TestCreateStudent {

    public Student studentObject() {
        return new Student("Sergi", "Aznale", 39, "UB", new Car(4, 5, "groc"));
    }


    @Test
    public void addBookGetBooksTest(){
        Faker faker = new Faker();
        Book llibre = new Book(faker.book().title(),faker.random().nextInt(50,600),faker.random().hex(13),new Author(faker.book().author(),faker.animal().name(),faker.random().nextInt(15,80)));
        Book llibre2 = new Book(faker.book().title(),faker.random().nextInt(50,600),faker.random().hex(13),new Author(faker.book().author(),faker.animal().name(),faker.random().nextInt(15,80)));
        Student student = studentObject();
        student.addBook(llibre);
        student.addBook(llibre2);
        Assertions.assertEquals(llibre,student.getBooks().get(0));
        Assertions.assertEquals(llibre2,student.getBooks().get(1));
        System.out.println(student);
    }
}
