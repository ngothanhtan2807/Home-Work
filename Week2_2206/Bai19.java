package Week2_2206;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Bai19 {
    public static void printHashSet() {
        List<Integer> list = Bai1.createRandomArray();
        HashSet<Integer> set = new HashSet<>(list);
        System.out.println("Cac phan tu cua hashset sau khi chuyen tu mang tren: ");
        for (Integer integer : set) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printHashSet();
    }
}
