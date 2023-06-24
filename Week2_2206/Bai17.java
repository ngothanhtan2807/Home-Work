package Week2_2206;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Bai17 {
    public static boolean containsArrayList(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        boolean res = false;
        // check arr1 contain arr2
        if (arr1.size() < arr2.size()) {
            res = false;
        } else {
            HashSet<Integer> set = new HashSet<>(arr2);
            res = arr1.containsAll(set);
        }

        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(1, 2, 3, 4));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(1, 5, 4));
        System.out.println(containsArrayList(arr1, arr2));
    }
}
