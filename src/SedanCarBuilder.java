class SedanCarBuilder implements CarBuilder {
    private int wheels;
    private String engine;
    private String color;

    @Override
    public CarBuilder setWheels(int numberOfWheels) {
        this.wheels = numberOfWheels;
        return this;
    }

    @Override
    public CarBuilder setEngine(String engineType) {
        this.engine = engineType;
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public Car build() {
        return new Car(wheels, engine, color);
    }
}