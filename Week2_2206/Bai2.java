package Week2_2206;

import java.util.HashSet;
import java.util.List;

public class Bai2 {
    public static HashSet<Integer> convertFromArrayList() {
        List<Integer> arrayList = Bai1.createRandomArray();
        HashSet<Integer> result = new HashSet<>(arrayList);
        System.out.println("HashSet duoc tao tu ArrayList tren la: ");
        return result;
    }

    public static void main(String[] args) {
        System.out.println(convertFromArrayList());
    }
}
