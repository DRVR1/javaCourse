package advanced.collections.foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 1);

        // Consumer with for each (way 1)
        Consumer<Integer> consumer = new Consumer<Integer>() {
            public void accept(Integer i) {
                System.out.println(i);
            }
        };
        nums.forEach(consumer);

        // Consumer with for each (way 2)
        nums.forEach(new Consumer<Integer>() {
            public void accept(Integer i) {
                System.out.println(i);
            }
        });

        // Consumer with for each (way 3)
        nums.forEach((Integer n) -> {
            System.out.println(n);
        });

        // Consumer with for each (way 4)
        nums.forEach(n -> System.out.println(n));

    }
}
