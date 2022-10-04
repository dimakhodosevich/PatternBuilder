package by.itstep.khodosevich.controller;

import by.itstep.khodosevich.module.BuilderCar;
import by.itstep.khodosevich.module.Car;

public class ControllerBuilder {
    public static void main(String[] args) {
        Car car1 = new BuilderCar().setCarEngine("Citroen").setCarType("Van").setCarEngine("2.0").createCar();
        System.out.println(car1);
        Car car2 = new BuilderCar().createCar();
        System.out.println(car2);
    }
}
