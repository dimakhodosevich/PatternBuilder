package by.itstep.khodosevich.module;

public class Car {
    private String carName;
    private String carEngine;
    private String carType;

    public Car() {
        carName = "no name";
        carEngine = "no engine";
        carType = "no type";
    }

    public Car(String carName, String carEngine, String carType) {
        this.carName = carName;
        this.carEngine = carEngine;
        this.carType = carType;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(String carEngine) {
        this.carEngine = carEngine;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car: " + "car name - " + carName
                + " car engine - " + carEngine
                + " car type - " + carType + '\n';
    }
}
