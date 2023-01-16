package org.Person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCreateCar {


    @Test
    public void toStringTest() {
        Car car = new Car(5, 7, "Vermell");
        String esperat = "5 portes, 7 llocs i és de color Vermell";
        Assertions.assertEquals(esperat, car.toString());
    }


}
