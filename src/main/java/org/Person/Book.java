package org.Person;

import lombok.Getter;
import lombok.Setter;

public class Book {
        private String title;
        private @Getter @Setter int pages;
        private String ISBN;
        private @Getter @Setter Author author;

    public Book(String title, int pages, String ISBN, Author author) {
        this.title = title;
        this.pages = pages;
        this.ISBN = ISBN;
        this.author = author;
    }

    @Override
    public String toString() {
        return "\n Títol: " + this.title + " - Pàgines: " + this.pages + " - ISBN: " + this.ISBN + " - Autor: " + this.author.getFirstName();
    }
}
