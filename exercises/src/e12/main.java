package e12;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "David", "Bob");

        // TODO: Print the original list
        System.out.println(names.toString());

        // TODO: Convert the list to a LinkedHashSet to remove duplicates while
        // preserving order
        LinkedHashSet hashSet = new LinkedHashSet<String>(names);

        // TODO: Print the set of unique names
        System.out.println(hashSet.toString());
    }
}

// Working with Collections in Java: Remove Duplicates and Display in Order

// Instructions:
// You are provided with a list of names in the starter file. Your task is to:

// Use the given list of names stored in a List<String>.

// Remove duplicates using a Set.

// Print the original list and the list after removing duplicates.

// Expected Output (order may vary for Set):

// Original List: [Alice, Bob, Alice, David, Bob]

// Unique Names: [Alice, Bob, David]
