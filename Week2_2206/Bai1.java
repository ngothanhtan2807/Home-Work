package Week2_2206;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Bai1 {
    public static int sumArray() {
        int sum = 0;

        List<Integer> arr = createRandomArray();

        for (Integer integer : arr) {
            sum += integer;
        }
        System.out.print("Tong cua cac phan tu trong mang la: ");
        return sum;
    }

    public static List<Integer> createRandomArray() {
        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cho array:");
        int length = sc.nextInt();
        int value;
        for (int i = 0; i < length; i++) {
            value = (int) Math.floor(Math.random() * 100);
            arr.add(value);
        }
        System.out.println("Array ngau nhien duoc tao la: ");
        System.out.println(arr);
        return arr;
    }

    public static void main(String[] args) {
        // System.out.println(sumArray());

    }
}
