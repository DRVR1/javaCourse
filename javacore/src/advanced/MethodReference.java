package advanced;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "x");
        list.stream()
                .filter(x -> x.startsWith("x"))
                .forEach(System.out::println);
    }

}
