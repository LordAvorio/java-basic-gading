package gadingpackage.application;

import gadingpackage.data.Avanza;
import gadingpackage.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}
