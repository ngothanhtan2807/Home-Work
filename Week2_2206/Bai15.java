package Week2_2206;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Bai15 {
    public static void insertElementAt() {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = Bai1.createRandomArray();
        try{
            System.out.println("Mang co size la: "+list.size());
            System.out.println("Chon vi tri can chen: ");
            int index = sc.nextInt();
            System.out.println("Nhap phan tu can them vao mang tren:");
            int input = sc.nextInt();
            list.add(index,input);
            System.out.println("Mang sau khi chen: ");
            System.out.println(list);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("vi tri can chen be hon hoac bang "+ list.size());
        }
        catch(InputMismatchException e){
            System.out.println("Nhap sai dinh dang, phan tu can chen phai la so nguyen");
        }

    }
    public static void main(String[] args) {
        insertElementAt();
    }
}
