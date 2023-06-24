package Week2_2206;

import java.util.ArrayList;
import java.util.List;

public class Bai14 {
    public static String isEmptyList() {
        // List<Integer> input = new ArrayList<>();
        List<Integer> input = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        // List<Integer> input = Bai1.createRandomArray();
        return (input.isEmpty() ? "Day la Empty ArrayList" : "Day khong phai la Empty ArrayList");
    }

    public static void main(String[] args) {
        System.out.println(isEmptyList());
    }
}
