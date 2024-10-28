package org.example;

public class Person {
    public String personName;
    private Car car;

    public Person(String personName) {
        this.personName = personName;
    }

    public void startCar(Car car) {
        car.start();
    }

    public void driveCar(Car car) {
        car.drive();
    }
}
