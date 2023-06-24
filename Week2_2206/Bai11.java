package Week2_2206;

import java.util.ArrayList;
import java.util.List;

public class Bai11 {
    public static ArrayList<Integer> copyOfArrayList() {
        List<Integer> input = Bai1.createRandomArray();

        ArrayList<Integer> ouput = new ArrayList<>(input);
        // if (input == ouput) {
        // System.out.println("trung nhau");
        // } else {
        // System.out.println("Khac nhau");
        // }
        System.out.println("Mang sau khi copy:");
        return ouput;
    }

    public static void main(String[] args) {
        System.out.println(copyOfArrayList());
    }
}
