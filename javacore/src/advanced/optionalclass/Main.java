package advanced.optionalclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("a", "ab", "c", "ad", "e", "f", "g", "h", "ai");
        Optional<String> opt = arr.parallelStream().filter((x) -> {
            return x.startsWith("ad");
        }).findFirst();

        if (opt.isPresent()) {
            System.out.println(opt.get());
        }

    }
}
