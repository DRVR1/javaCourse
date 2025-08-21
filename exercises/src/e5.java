import java.util.Scanner;

public class e5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again = "y";

        // TODO: Use a while loop to keep calculating while 'again' is 'y'
        while (again.equals("y")) {
            // TODO: Ask user for two numbers
            System.out.print("Enter first number: ");
            int number1 = input.nextInt();

            System.out.print("Enter second number: ");
            int number2 = input.nextInt();

            // TODO: Ask user for the operation (+, -, *, /)
            System.out.print("Choose operation (+, -, *, /): ");
            input.nextLine();
            String operation = input.nextLine();

            // TODO: Use if-else to perform the operation
            if (operation.equals("+")) {
                System.out.println("Result: " + (number1 + number2));
            } else if (operation.equals("-")) {
                System.out.println("Result: " + (number1 - number2));
            } else if (operation.equals("*")) {
                System.out.println("Result: " + (number1 * number2));
            } else if (operation.equals("/")) {
                // TODO: Handle division by zero case
                try {
                    int result = number1 / number2;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic exception: " + e);
                }

            }
            // TODO: Ask if user wants to continue
            System.out.print("Do you want to calculate again? (y/n): ");
            again = input.nextLine();
            if (again.equals("n")) {
                // TODO: Exit the loop and print a thank you message
                System.out.println("Thank you for using the calculator.");
                return;
            } else if (again.equals("y")) {
                // Repeat loop
            } else {
                // Repeat loop
                again = "y";
            }

        }

    }
}
