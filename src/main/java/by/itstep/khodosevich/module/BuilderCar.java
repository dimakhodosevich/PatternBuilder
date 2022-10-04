package by.itstep.khodosevich.module;

public class BuilderCar implements Builder{
    private Car car;

    public BuilderCar() {
        car = new Car();
    }

    public BuilderCar(Car car) {
        this.car = car;
    }

    @Override
    public Builder setCarName(String name) {
        car.setCarName(name);
        return  this;
    }

    @Override
    public Builder setCarType(String type) {
        car.setCarType(type);
        return this;
    }

    @Override
    public Builder setCarEngine(String engine) {
        car.setCarEngine(engine);
        return this;
    }

    @Override
    public Car createCar() {
        return car;
    }
}
