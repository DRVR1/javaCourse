public class e2 {

    public static void main(String[] args) {
        // write code here
        int a = 20;
        int b = 10;
        int c;
        c = a + b;
        System.out.println("Addition: " + c);
        c = a - b;
        System.out.println("Subtraction: " + c);
        c = a * b;
        System.out.println("Multiplication: " + c);
        c = a / b;
        System.out.println("Division: " + c);

        boolean booleanvar = false;
        if (a > b) {
            booleanvar = true;
        }
        System.out.println("Is a greater than b? " + booleanvar);
        boolean booleanvar2 = true;
        if (a > b && b > 0) {
            booleanvar2 = true;
        }
        System.out.println("Is a > b and b > 0? " + booleanvar2);

    }
}

// Your task is to write a Java program that:

// 1. Declare two integer variables a = 20 and b = 10.

// 2. Perform the following operations:

// a. Add, subtract, multiply, and divide a and b

// b. Compare if a is greater than b and store the result in a boolean variable

// c. Check if a > b and b > 0 using a logical operator and store the result

// 3. Print the results of all operations using System.out.println() in the
// specified format.