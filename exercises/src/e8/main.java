package e8;

public class main {
    public static void main(String[] args) {
        Machine fan = new Fan("Fan");
        System.out.println(fan.start());
        Machine washer = new WashingMachine("Washing Machine");
        System.out.println(washer.start());

    }
}
