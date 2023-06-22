package Week2_2206;

import java.util.LinkedList;
import java.util.List;

public class Bai3 {
    public static LinkedList<String> revertLinkedList() {
        LinkedList<String> input = new LinkedList<>(List.of("111", "222", "333"));
        System.out.println("LinkedList input la: ");
        System.out.println(input);
        LinkedList<String> output = new LinkedList<>();
        int size = input.size();
        for (int i = 0; i < size; i++) {
            output.add(input.get(size - i - 1));
        }
        System.out.println("LinkedList sau khi dao nguoc la: ");
        return output;

    }

    public static void main(String[] args) {
        System.out.println(revertLinkedList());
    }
}
