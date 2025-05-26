package basics.enumm;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(CarColor.RED, CarBrand.bugatti);

        CarColor carColor = car.getColor();
        CarBrand CarBrand = car.getCarBrand();

        System.out.println("color is: " + carColor);
        System.out.println("price is: " + CarBrand.getPrice());
        System.out.println("speed is: " + CarBrand.getSpeed());
        System.out.println("brand is: " + CarBrand);

        switch (carColor) {
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
