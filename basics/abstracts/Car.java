package basics.abstracts;

public abstract class Car {
    private int topSpeed;
    private String brand;

    public abstract void accelerate();

    public abstract void brake();

    public void playMusic() {
        System.out.println("Playing music like every car!");
    }

    public Car(int topSpeed, String brand) {
        this.topSpeed = topSpeed;
        this.brand = brand;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
