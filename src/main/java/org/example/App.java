package org.example;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Mark");
        Car Car = new Car("Mazda");
        person.startingCar(Car);
        person.drivingCar(Car);

    }
}
