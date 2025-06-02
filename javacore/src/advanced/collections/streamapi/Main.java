package advanced.collections.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        // Stream api functions
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> stream1 = list.stream();
        Stream<Integer> stream2 = stream1.filter(n -> n % 2 == 0);
        Stream<Integer> stream3 = stream2.map(n -> (int) Math.pow(n, 3));
        stream3.forEach(n -> System.out.println(n));
        System.out.println("");

        // Less verbose way
        System.out.println("Easier way: ");
        List<Integer> list2 = Arrays.asList(26, 6, 1, 4, 2, 42, 2, 10);
        list2.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n * n)
                .sorted()
                .forEach(n -> System.out.println(n));
        System.out.println("");

        // Using multi thread stream for performance
        System.out.println("Parallel stream (no sorting): ");
        List<Integer> list3 = Arrays.asList(26, 6, 1, 4, 2, 42, 2, 10);
        list3.parallelStream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n * n)
                .forEach(n -> System.out.println(n));
    }
}
