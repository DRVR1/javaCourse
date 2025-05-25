package basics;

enum CarColor {
    RED, GREEN, BLUE, ORANGE
}

class Car {
    CarColor color;

    public Car(CarColor color) {
        this.color = color;
    }

    public void askColor() {
        System.out.println(this.color);
    }

}

public class Enum {
    public static void main(String[] args) {

        System.out.println(CarColor.ORANGE);

        Car car = new Car(CarColor.RED);

        car.askColor();

        CarColor c = CarColor.GREEN;
        switch (c) {
            case ORANGE:
                System.out.println("is orange");
                break;
            case RED:
                System.out.println("is red");
                break;
            case GREEN:
                System.out.println("is green");
                break;
            case BLUE:
                System.out.println("is blue");
                break;
        }
    }
}
