package basics.enumeratives;

public class Car {
    private CarColor color;
    private CarBrand carBrand;

    public Car(CarColor color, CarBrand carBrand) {
        this.color = color;
        this.carBrand = carBrand;
    }

    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public CarBrand getCarBrand() {
        return this.carBrand;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

}
