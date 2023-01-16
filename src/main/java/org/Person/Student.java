package org.Person;

import lombok.Getter;

import java.util.ArrayList;

public class Student extends Person {

    private String university;
    private Car car;
    private @Getter ArrayList<Book> books;

    public Student(String firstName, String lastName, int age, String university) {
        super(firstName, lastName, age);
        this.university = university;
        this.books = new ArrayList<>();
    }

    public Student(String firstName, String lastName, int age, String university, Car car) {
        super(firstName, lastName, age);
        this.university = university;
        this.books = new ArrayList<>();
        this.car = car;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }


    @Override
    public String toString() {
        return super.toString() + " - Universitat: " + this.university +" - Vehicle: "+ this.car;
    }
}
