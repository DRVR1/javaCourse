package basics;

class Phone {
    String model;
    String brand;
    int memory;

    public Phone() {
        this.model = "Default model";
        this.brand = "Default brand";
        this.memory = 0;
    }

    public Phone(String model, String brand, int memory) {
        this.model = model;
        this.brand = brand;
        this.memory = memory;
    }

    public String getModel() {
        return this.model;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getMemory() {
        return this.memory;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Phone phone = new Phone("S23", "Samsung", 128);
        System.out.println(phone.getBrand());
        phone.setBrand("Apple");
        System.out.println(phone.getBrand());
    }
}
