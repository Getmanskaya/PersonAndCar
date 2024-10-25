package org.example;

public class Person {
    public String personName;
    private Car car;

    public Person(String personName) {
        this.personName = personName;
    }

    public void drivingCar (Car car){
        car.drive();
    }

    public void startingCar (Car car){
        car.start();
    }
}
