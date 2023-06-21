package Week2_2106;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class DemoCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(10);
        System.out.println("size: " + list.size());
        boolean isEmpty = list.isEmpty();
        System.out.println("is empty: " + isEmpty);

        System.out.println("element in the collection:");
        for (int integer : list) {
            System.out.print(integer + " ");
        }
        int remove = list.remove(0);
        System.out.println("remove: " + remove);
        boolean remove1 = list.remove(Integer.valueOf(30));
        System.out.println(remove1);
        for (int integer : list) {
            System.out.print(integer + " ");
        }
        LinkedList<Integer> linklist = new LinkedList<>();
        linklist.remove(2);
        // Set<Integer> set = new HashSet<>();
        // System.out.println(set.add(10));
        // set.add(20);
        // set.add(30);
        // set.add(10);
        // set.add(10);
        // System.out.println(set.size());
        // System.out.println(list);
        // System.out.println(set);
    }
}
