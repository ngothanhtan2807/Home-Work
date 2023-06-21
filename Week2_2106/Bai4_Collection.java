package Week2_2106;

import java.util.ArrayList;
import java.util.List;

public class Bai4_Collection {
    public static void migrate(List<String> left, List<String> right) {
        int size = left.size();
        for (int i = 0; i < size; i++) {
            right.add(left.remove(0));
        }
        System.out.println("left: " + left);
        System.out.println("right: " + right);
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>(List.of("x", "y", "c", "d"));
        List<String> list2 = new ArrayList<String>(List.of("z"));

        migrate(list1, list2);
    }
}
