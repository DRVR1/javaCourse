package basics.polymorphism;

import basics.polymorphism.*;

public class Main {
    public static void main(String[] args) {
        SportCar car = new SportCar();
        car.speed();

        car = new SuperCar();
        car.speed();

        car = new Bicicle(); // This will throw an error! Beacuse we can only
        // reassign references to objects
        // that are inherited between themselves
    }
}
