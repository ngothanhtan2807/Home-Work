package Week2_2006;

import java.util.Arrays;

public class Bai3_Array {
    public static int[] findMinMax(int[] arr) {
        int[] result;
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        result = new int[] { min, max };
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMinMax(new int[] { 1, 2, 3, -7, 4, 5 })));
    }
}
