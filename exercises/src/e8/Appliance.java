package e8;

import e8.Machine;
// Create an abstract class called Appliance that:

// Implements Machine

// Has a String name field

// Has a constructor to set the name
public abstract class Appliance implements Machine {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Appliance(String name) {
        setName(name);
    }
}
