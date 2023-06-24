package Week2_2206;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Bai13 {
    public static int countAppear() {
        int count = 0;
        LinkedList<Integer> list = new LinkedList<Integer>(Bai1.createRandomArray());
        System.out.println("Nhap phan tu can kiem tra, la 1 phan tu cua mang tren:");
        Scanner scanner = new Scanner(System.in);
        int input;
        try {
            input = scanner.nextInt();
            for (Integer integer : list) {
                if (input == integer) {
                    count++;
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Sai dinh dang");
            count = 0;
        }
        System.out.print("So lan xuat hien cua phan tu nhap vao la: ");
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countAppear());
    }
}
