public class Main {
    public static void main(String[] args) {


        CarBuilder builder = new SedanCarBuilder();
        Car car = builder.setWheels(4)
                .setEngine("V6")
                .setColor("Black")
                .build();
        System.out.println(car);

    }
}