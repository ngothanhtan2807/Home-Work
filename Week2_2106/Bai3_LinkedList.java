package Week2_2106;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Bai3_LinkedList {
    public static List<String> migrate(LinkedList<String> left, ArrayList<String> right) {
        // System.out.println(left);
        // String temp = "";
        int size = left.size();
        for (int i = 0; i < size; i++) {
            right.add(left.pop());

            // System.out.println(left.size());
        }
        // right.addAll(left);
        // left.clear();
        return right;
    }

    public static void main(String[] args) {
        LinkedList<String> left = new LinkedList<String>(List.of("a", "b", "c"));
        ArrayList<String> right = new ArrayList<String>();

        System.out.println(migrate(left, right));
    }

}
