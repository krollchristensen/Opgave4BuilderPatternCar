interface CarBuilder {
    CarBuilder setWheels(int numberOfWheels);
    CarBuilder setEngine(String engineType);
    CarBuilder setColor(String color);
    Car build();
}