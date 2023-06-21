package Week2_2106;

import java.util.ArrayList;
import java.util.List;

public class Bai2_Collection {
    public static String takeFirst(List<String> arr) {
        return arr.get(0);
    }

    public static String takeLast(List<String> arr) {
        return arr.get(arr.size() - 1);
    }

    public static void main(String[] args) {
        List<String> arr01 = new ArrayList<String>(List.of("a", "b", "c"));
        List<String> arr02 = new ArrayList<String>(List.of("a"));

        System.out.println(takeFirst(arr01)); // "a"
        System.out.println(takeLast(arr01)); // "c"

        System.out.println(takeFirst(arr02)); // "a"
        System.out.println(takeLast(arr02)); // "a"
    }
}
