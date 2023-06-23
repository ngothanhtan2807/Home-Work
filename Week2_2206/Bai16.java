package Week2_2206;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Bai16 {
    public static String priorityQueue() {
        List<Integer> list = Bai1.createRandomArray();
        PriorityQueue<Integer> priotity = new PriorityQueue<>(list);
        System.out.println(priotity);
        String res = "";
        int size = priotity.size();

        for (int i = 0; i < size; i++) {
            res += priotity.poll() + " ";
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(priorityQueue());
    }
}
