public class e6 {

    public static void main(String[] args) {
        // TODO: Declare and initialize an integer array with the values 45, 22, 89, 16,
        // 90, and 33
        int[] arr = { 45, 22, 89, 16, 90, 33 };
        // TODO: Initialize min and max with the first element
        int min = arr[0];
        int max = arr[0];
        // TODO: Use an enhanced for loop to find min and max
        for (int number : arr) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        // TODO: Print the smallest and largest numbers
        // Smallest: 16
        // Largest: 90
        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }

}

// Working with Arrays in Java: From Basics to Enhanced For Loops

// You are given an array of integers. Your task is to write a Java program that
// finds and prints the smallest and largest numbers from the array using an
// enhanced for loop (also known as a for-each loop).

// This will help you practice iterating through arrays efficiently while
// tracking values.

// Instructions:

// Use the following array in your program:
// int[] numbers = {45, 22, 89, 16, 90, 33};

// Declare two variables:

// One to keep track of the smallest number (initialize with the first element).

// One to keep track of the largest number (also initialize with the first
// element).

// Use a for-each loop to iterate over the array.

// Update the smallest and largest variables as you compare each element.

// Print both values using System.out.println() in this exact format:

// Expected Output:

// Smallest: 16

// Largest: 90