package Week2_2206;

import java.util.HashSet;
import java.util.List;

public class Bai9 {
    public static void addArraylistToHashset() {
        List<Integer> list = Bai1.createRandomArray();
        HashSet<Integer> set = new HashSet<Integer>(list);
        System.out.println(set);
    }
    public static void main(String[] args) {
        addArraylistToHashset();
    }
}
