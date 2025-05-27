package basics.exceptions;

import java.rmi.server.ExportException;

public class Main {
    public static void main(String[] args) {

        // Handle any exception
        int a = 8;
        int b = 0;
        try {
            System.out.println("Trying to divide by 0");
            System.out.println(a / b);
            System.out.println("This will not execute");
        } catch (Exception e) {
            System.out.println("Message: " + e.getMessage());
        }
        System.out.println("End");

        // Handle multiple types of exception
        String emptyReference = null; // Creates an empty reference to a String object
        try {
            System.out.println(emptyReference.length());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e);
        } catch (RuntimeException e) {
            System.out.println("Runtime exception: " + e);
        } catch (Exception e) {
            System.out.println("Unhandled exception: " + e);
        }

        // Manually throw an exepcion
        int c = 1;
        try {
            if (c == 1) {
                throw new Exception("I dont want c to equal 1");
            }
        } catch (Exception e) {
            System.out.println("Handled exeption: " + e);
        }

        // Create and use a custom exception
        int d = 1;
        try {
            if (d == 1) {
                throw new IanExeption("i dont like the number 1");
            }
        } catch (Exception e) {

            System.out.println("Handled exception: " + e);
        }
    }

}
