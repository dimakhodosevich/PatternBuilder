package by.itstep.khodosevich.controller;

import by.itstep.khodosevich.module.BuilderCar;
import by.itstep.khodosevich.module.Car;

public class ControllerBuilder {
    public static void main(String[] args) {
        Car car = new BuilderCar().setCarEngine("Citroen").setCarType("Van").setCarEngine("2.0").createCar();
        System.out.println(car);
    }
}
