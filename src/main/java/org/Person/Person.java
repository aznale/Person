package org.Person;

import lombok.Getter;

import java.util.Objects;

public class Person {
    private @Getter String firstName;
    private @Getter String lastName;
    private @Getter int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 100;
    }

    public void becomeOlder() {
        age = age + 5;
    }

    public void killVampire() {
        age = -150;
    }

    public Person withFirstName(String firstName) {
        return new Person(firstName, lastName);
    }

    public Person withLastName(String lastName) {
        return new Person(firstName, lastName);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        if (!Objects.equals(firstName, person.firstName)) {
            return false;
        }
        return Objects.equals(lastName, person.lastName);
    }

    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}