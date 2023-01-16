package org.Person;

public class Car {
    private int doors;
    private int places;
    private String color;

    public Car(int doors, int places, String color) {
        this.doors = doors;
        this.places = places;
        this.color = color;
    }

    @Override
    public String toString() {
        return  this.doors + " portes, " + this.places + " llocs i és de color " + this.color;
    }
}
