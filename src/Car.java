class Car {
    private final int wheels;
    private final String engine;
    private final String color;

    public Car(int wheels, String engine, String color) {
        this.wheels = wheels;
        this.engine = engine;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}