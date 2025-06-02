package basics.hash;

class Laptop {
    int price;
    String name;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Laptop [price=" + price + ", name=" + name + "]";
    }

    public Laptop(int price, String name) {
        this.price = price;
        this.name = name;
    }

}

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(300, "Lenovo");
        System.out.println(laptop); // overrided toString() method is being executed here
    }
}
