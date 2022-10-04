package by.itstep.khodosevich.module;

public interface Builder {
    Builder setCarName(String name);
    Builder setCarType(String type);
    Builder setCarEngine(String engine);
    Car createCar();
}
