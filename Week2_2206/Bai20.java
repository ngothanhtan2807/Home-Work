package Week2_2206;

import java.util.List;

public class Bai20 {
    public static String getFirstAndLast() {
        List<Integer> list = Bai1.createRandomArray();
        return "first is: " + list.get(0) + " and last is: " + list.get(list.size()-1) ;
    }
    public static void main(String[] args) {
        System.out.println(getFirstAndLast());
    }
}
