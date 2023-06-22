package Week2_2206;

import java.util.List;

public class Bai4 {
    public static int findMax() {
        List<Integer> arr = Bai1.createRandomArray();
        int max = 0;
        for (Integer integer : arr) {
            if (max < integer) {
                max = integer;
            }
        }
        System.out.print("Phan tu lon nhat trong array la: ");
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMax());
    }
}
