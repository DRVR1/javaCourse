package advanced.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

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

        // Hash Set (Collection that contains unique values)
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);

        // Tree Set (Collection that contains sorted and unique values)
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(5);
        treeSet.add(4);
        System.out.println(treeSet);

        // Hash Map (Collection that contains pairs of key-value)
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("k1", 1);
        hashMap.put("k2", 2);
        System.out.println(hashMap);
        System.out.println(hashMap.get("k2"));
        System.out.println(hashMap.keySet());

        // Collections (java.util.Collections)
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(9);
        arrayList.add(2);
        arrayList.add(0);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);

        // Same with custom comparator
        Comparator<Integer> comparator = new Comparator<Integer>() {
            public int compare(Integer j, Integer k) {
                // 1 means swap?
                if (j > k) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        ArrayList arrayList2 = new ArrayList<>();
        arrayList2.add(5);
        arrayList2.add(3);
        arrayList2.add(9);
        arrayList2.add(2);
        arrayList2.add(0);
        System.out.println(arrayList2);
        Collections.sort(arrayList2, comparator);
        System.out.println(arrayList2);

    }
}
