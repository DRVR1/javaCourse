package advanced.collections.parallelstream;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Create a squence of 10.000 random numbers

        int size = 10_000;
        ArrayList<Integer> arrayList = new ArrayList<>(size);
        Random rand = new Random(123);
        for (int i = 0; i < size; i++) {
            arrayList.add(rand.nextInt(100));
        }

        // Perform some operations on the array with stream and parallel stream, and see
        // who takes longer
        long sum1Start = System.currentTimeMillis();
        int sum1 = arrayList.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x + 100)
                .mapToInt(i -> i)
                .sum();
        long sum1Time = System.currentTimeMillis() - sum1Start;

        long sum2Start = System.currentTimeMillis();
        int sum2 = arrayList.parallelStream()
                .filter(x -> x % 2 == 0)
                .map(x -> x + 100)
                .mapToInt(i -> i)
                .sum();
        long sum2Time = System.currentTimeMillis() - sum2Start;

        System.out.println("Sum1 = " + sum1);
        System.out.println("Sum2 = " + sum2);
        System.out.println("T1= " + sum1Time + "ms" + " T2=  " + sum2Time + "ms");

    }
}
