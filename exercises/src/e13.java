import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Use filter, map, sorted, and collect with Stream.
public class e13 {
    public static void main(String[] args) {

        List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");

        // TODO: Print the original list
        System.out.println(products.toString());

        // TODO: Filter names longer than 5 characters, convert to uppercase, sort, and
        // collect into a list
        List<String> filtered = products.stream()
                .filter(x -> x.length() > 5)
                .map(x -> x.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(filtered);

        // TODO: Print the filtered list
    }
}
