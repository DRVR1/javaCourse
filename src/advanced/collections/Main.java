package advanced.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        // Array List
        ArrayList<Object> a = new ArrayList<>();
        a.add("Hello world");
        a.add(1);
        System.out.println(a.toString());

        for (Object item : a) {
            System.out.println(item);
        }

        // Hash Set
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);
    }
}
