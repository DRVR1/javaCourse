package e8;
// Create two concrete classes:

// Fan, which extends Appliance and overrides start() to return "Fan is running"
public class Fan extends Appliance {
    public Fan(String name) {
        super(name);
    }

    public String start() {
        return "Fan is running";
    }
}
