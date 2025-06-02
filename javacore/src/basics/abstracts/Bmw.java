package basics.abstracts;

public class Bmw extends Car {
    public Bmw(int topSpeed, String brand) {
        super(topSpeed, brand);
    }

    public void accelerate() {
        System.out.println("Accelerating fast!");
    }

    public void brake() {
        System.out.println("Breaking with sports ABS brakes");
    }
}
