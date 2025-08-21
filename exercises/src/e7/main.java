package e7;

public class main {
    public static void main(String[] args) {
        Employee employee = new Employee("Alice", 50000);

        Employee manager = new Manager("Bob", 80000, "IT");

        System.out.println(employee.getDetails());
        System.out.println(manager.getDetails());
    }

}

// Design a
// basic employee
// management system
// in Java
// using object-oriented principles.

// In the main() method:

// Create one Employee object and one Manager object

// Store both in variables of type Employee

// Print their details using

// the getDetails() method

// This will demonstrate how inheritance and polymorphism work in Java.

// Instructions:

// Define class Employee and subclass Manager.

// Keep fields private and use a constructor to set values.

// Override getDetails() in the subclass to extend functionality.

// Use super() and this keywords appropriately.

// Print output using System.out.println() and match formatting.

// Expected Output:
// Name: Alice, Salary: 50000.0

// Name: Bob, Salary: 80000.0, Department: IT
