package org.example;

import static java.awt.AWTEventMulticaster.add;

public class Car {
    public String model;

    public Car(String mazda) {
        this.model = model;
    }


    public void start() {
        System.out.println("Автомобиль завелся");
    }

    public void drive() {
        System.out.println("Автомобиль едет");
    }

    public String getCarModel() {
        return model;
    }
}
