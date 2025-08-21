package e8;

// WashingMachine, which extends Appliance and overrides start() to return
// "Washing Machine is operating"
public class WashingMachine extends Appliance {
    public WashingMachine(String name) {
        super(name);
    }

    public String start() {
        return "Washing Machine is operating";
    }

}
