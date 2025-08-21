package e7;
// Create a base

// class Employee with:

// Private fields:

// name (String), salary (double)

// A constructor to initialize these fields

// Public getter methods

// A method getDetails() that returns:

// Name: {name}, Salary: {salary}
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getDetails() {
        return "Name: " + name + ", Salary: " + salary;
    }

}
