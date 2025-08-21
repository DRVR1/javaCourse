package e7;
// Create a subclass Manager that:

// Has an additional private field: department (String)

// Uses super() to call the parent constructor

// Overrides getDetails() to include the department:

// Name: {name}, Salary: {salary}, Department: {department}
public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getDetails() {
        return "Name: " + this.getName() + ", Salary: " + this.getSalary() + ", Department: " + this.getDepartment();
    }

}
