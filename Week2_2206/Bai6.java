package Week2_2206;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Bai6 {
    public static String isContainValue() {
        List<Integer> arr = Bai1.createRandomArray();
        boolean result = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri can kiem tra: ");
        try {
            int input = sc.nextInt();
            if (arr.contains(input)) {
                result = true;
            } else {
                result = false;
            }
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("So can kiem tra khong hop le");
            result = false;
        } finally {
            return (result ? "ArrayList co chua gia tri kiem tra"
                    : "Gia tri can kiem tra khong ton tai trong ArrayList");
        }

    }

    public static void main(String[] args) {
        System.out.println(isContainValue());
    }
}
