package Week2_2106;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Bai4_LinkedList {
    public static List<String> reverse(LinkedList<String> arr) {
        List<String> res = new LinkedList<>();
        for (int i = 0; i < arr.size(); i++) {
            res.add(arr.get(arr.size() - 1 - i));
        }
        Collections.reverse(arr);
        return res;
    }

    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<String>(List.of("a", "b", "c"));
        // System.out.println(reverse(arr));
        reverse(arr);
    }
}
